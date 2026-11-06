package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends  BasePage{
    //<a data-v-6475d26d="" class="oxd-main-menu-item active toggle" href="/web/index.php/admin/viewAdminModule">
    private  static  final By MENU_ADMIN = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");


    // - //span[text()='Admin'] -- tìm theo span ( ở trên là tìm theo thẻ a)
    // - ////a[.//span[text()='Admin']]
    // - //a => cấu trúc tìm tất cả các thẻ a có trong page đó
    // - dấu "." => chính là <a> đang xét
    // - .// => tìm tất cả các thẻ span trong a
    private static final By ADMIN_HERDER = By.xpath("//h6[text()='Admin']");
    private static final By USER_DROPDOW = By.xpath("//span[@class='oxd-userdropdown-tab']");
    private static final By LOGOUT_BTN = By.xpath("//a[href='/web/index.php/auth/logout']");


    public DashboardPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public boolean isElementPresnt(){
        boolean checkLocators = true;
        WebElement menuAdmin = driver.findElement(MENU_ADMIN);

        if (!menuAdmin.isDisplayed()) {
            checkLocators = false;
            System.out.println("không tìm thấy locator admin");
            return checkLocators;
        }
        menuAdmin.click();


       WebElement adminHerder = wait.until(ExpectedConditions.visibilityOfElementLocated(ADMIN_HERDER));
       if(!adminHerder.isDisplayed()){
            checkLocators = false;
            System.out.println("không tìm thấy locator adminHerder");
            }
        return checkLocators;

    }
    public void logout(){
        WebElement userDropdow = wait.until(ExpectedConditions.visibilityOfElementLocated(USER_DROPDOW));
        userDropdow.click();
        WebElement logoutBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(LOGOUT_BTN));
        logoutBtn.click();

    }
}




