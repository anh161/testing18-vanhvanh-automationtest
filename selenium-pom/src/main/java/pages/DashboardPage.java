package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends  BasePage{
    //<a data-v-6475d26d="" class="oxd-main-menu-item active toggle" href="/web/index.php/admin/viewAdminModule">
    private  static  final By MENU_ADMIN = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule]");
    // - //span[text()='Admin'] -- tìm theo span ( ở trên là tìm theo thẻ a)
    // - ////a[.//span[text()='Admin']]
    // - //a => cấu trúc tìm tất cả các thẻ a có trong page đó
    // - dấu "." => chính là <a> đang xét
    // - .// => tìm tất cả các thẻ span trong a
    public DashboardPage(WebDriver driver, WebDriverWait wait){
    super(driver, wait);}
    public boolean isElementPresnt(){
        WebElement menuAdmin = driver.findElement(MENU_ADMIN);
        return menuAdmin.isDisplayed();

    }
}