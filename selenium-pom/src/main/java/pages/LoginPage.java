package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends  BasePage{
//<input data-v-1f99f73c=""
//    class="oxd-input oxd-input--active oxd-input--error"
//    name="username" placeholder="Username" autofocus="">
// xpath: rule de tìm locator trên wbesite
// //input[@name='username'] (input => tìm tất car các thẻ trong page
    // input[@name='username'] => tìm tất cả các thẻ input có thuộc tính name với value là username
    private static final By INPUT_USERNAME = By.xpath("//input[@name='username']");
    private static final By INPUT_PASSWORD = By.xpath("//input[@name='password']");
    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    //Step 1: truy cập vào trang page login
    public  void open() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //ĐỢI CÓ ĐIỀU KIỆN -> ĐỢI CXUAATS HIỆN INPUT
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
    }

    //Step2 : login
    // enterUSername, enterPassword, clickLogin button
    //cách 1: Các từng step thành từng function
    //=> ưu điểm dễ dàng thê, log kiểm tra,dễ sa
    //cách 2: gom các step thành 1 funtion

    public void login(String username, String password) throws InterruptedException {
        WebElement usernameInput = driver.findElement(INPUT_USERNAME);
        usernameInput.sendKeys(username);

        Thread.sleep(2000);

        WebElement passwordInput = driver.findElement(INPUT_PASSWORD);
        passwordInput.sendKeys(password);


        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(LOGIN_BTN);
        loginBtn.click();


        Thread.sleep(10_000);
    }
}
