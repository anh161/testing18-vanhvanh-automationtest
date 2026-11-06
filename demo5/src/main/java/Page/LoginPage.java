package Page;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends pages.BasePage {

    // Khai báo các locators theo giao diện trang Cyberbnb
    private static final By USER_ICON = By.xpath("//img[contains(@src, '6596121.png')]");
    private static final By LOGIN_BUTTON = By.xpath("//li[1]//button[contains(text(), 'Đăng nhập')]");




    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    //Step 1: truy cập vào trang chu cyber
    public  void open() {
        Allure.step("Open Cyberbnb home page",() -> {
            driver.get("https://demo5.cybersoft.edu.vn/");
            //ĐỢI CÓ ĐIỀU KIỆN -> ĐỢI CXUAATS HIỆN INPUT
            wait.until(ExpectedConditions.visibilityOfElementLocated(USER_ICON));
        });

    }
    public void clickLoginMenu() {
        Allure.step("Click on user icon and select login", () -> {
            // Click vào icon user ở góc trên bên phải
            wait.until(ExpectedConditions.elementToBeClickable(USER_ICON)).click();

            // Đợi popup/dropdown hiển thị và click vào nút "Đăng nhập"
            wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON)).click();
        });
    }

//
//    //Step2 : login
//    // enterUSername, enterPassword, clickLogin button
//    //cách 1: Các từng step thành từng function
//    //=> ưu điểm dễ dàng thê, log kiểm tra,dễ sa
//    //cách 2: gom các step thành 1 funtion
//
//    public void login(String username, String password) throws InterruptedException {
//        Allure.step("Enter username: " + username, () -> {
//            WebElement usernameInput = driver.findElement(INPUT_USERNAME);
//            usernameInput.sendKeys(username);
//        });
//
//
//        Thread.sleep(2000);
//
//        Allure.step("Enter password: ", () -> {
//            WebElement passwordInput = driver.findElement(INPUT_PASSWORD);
//            passwordInput.sendKeys(password);
//        });
//
//
//
//
//        Thread.sleep(2000);
//
//        Allure.step("Click login button " , () -> {
//            WebElement loginBtn = driver.findElement(LOGIN_BTN);
//            loginBtn.click();
//        });
//
//
//
//        Thread.sleep(10_000);
//    }
}
