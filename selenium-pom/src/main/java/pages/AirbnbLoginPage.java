package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class AirbnbLoginPage extends BasePage{
    private static final By LOGIN_BTN = By.xpath("(//button[text() ='Đăng nhập'])[1]");
    private static final By AVATA_IMG = By.xpath("//img[contains(@src, '6596121.png')]");
    private static final By USERNAME_INPUT = By.id("email");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BTN_FORM = By.xpath("//button[@type='submit' and text() ='Đăng nhập']");
    private static final By SUCCESS_TOAST = By.xpath("//div[@class='ant-message-notice-content']");


    public AirbnbLoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void open(){
        driver.get("https://demo5.cybersoft.edu.vn/");


        //vì truy cập vào demo5 lên cần chờ thời gian để locator xuất hiện
        wait.until(ExpectedConditions.visibilityOfElementLocated(AVATA_IMG));
    }
    public void login(String username, String password) {
        WebElement avataImg = driver.findElement(AVATA_IMG);
        avataImg.click();

        WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BTN));
        loginBtn.click();

        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_INPUT));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(PASSWORD_INPUT);
        passwordInput.sendKeys(password);

        WebElement loginBtnForm = driver.findElement(LOGIN_BTN_FORM);
        loginBtnForm.click();


    }
    public boolean isSuccessLogin(){
        WebElement successToast = wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_TOAST));
        return successToast.isDisplayed();
    }


}
