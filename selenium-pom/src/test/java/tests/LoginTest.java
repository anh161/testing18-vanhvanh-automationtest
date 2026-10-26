package tests;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test(description = "Test login succes")
    public void testLoginSuccess() throws InterruptedException {
        //tạo đối tợng LoginPage
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login("Admin", "admin123");

        // so sánh expected với actual
        Assert.assertTrue( true);


        // so sánh expected vowis actual
        String currentUrl = driver.getCurrentUrl();
        System.out.print(currentUrl);
        Assert.assertTrue(currentUrl.contains("dashboard"));

    }
}
