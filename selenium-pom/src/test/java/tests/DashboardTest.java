package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseTest{
    @BeforeMethod
    public void preCondition() throws InterruptedException {
        loginAdmin();
    }

    @Test(description = "Find locatons")
    public void findLocatons() throws InterruptedException{
        //pre-condition
//        LoginPage loginPage = new LoginPage(driver, wait);
//        loginPage.open();
//        loginPage.login("Admin", "admin123");

        //Thread.sleep(10_000);
       // wait.until(ExpectedConditions.urlContains("dashbroard")); //đợi códđiều kiên=> khi naof xuát hiện dasbroad
        // đợi xuất hiện 1 trong các element thì bypass
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")
        ));

        DashboardPage dashboardPage = new DashboardPage(driver, wait);
        Assert.assertTrue(dashboardPage.isElementPresnt());
    }
}
