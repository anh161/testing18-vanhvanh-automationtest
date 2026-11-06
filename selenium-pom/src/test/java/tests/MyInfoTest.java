package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MyInfoPage;

public class MyInfoTest extends BaseTest{
    @BeforeMethod
    public void preCondition() throws InterruptedException {
        loginAdmin();
    }
    @Test(description = "upload avata")
    public void uploadAvata() throws InterruptedException {
        MyInfoPage myInfoPage = new MyInfoPage(driver, wait);
        myInfoPage.open();
        myInfoPage.uploadAvata("logo.png");

        Thread.sleep(4000);

        Assert.assertTrue(true);
    }
}
