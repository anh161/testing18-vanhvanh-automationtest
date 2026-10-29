package tests;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;

import java.io.InputStreamReader;


public class LoginTest extends BaseTest{

    record LoginData(String username, String password, boolean success) {}
    // để load data cần @DataProvider : Testng lấy thông tin rồi chạy test cho dât đó
    // b1 viết function đọc data .json
    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() {

        InputStreamReader reader = new InputStreamReader(
                LoginTest.class.getResourceAsStream("/login-data.json")
        );

        //lý do dùng gson : biến file json thành object
        LoginData[] list = new Gson().fromJson(reader, LoginData[].class);

        Object[][] dataLogin = new Object[list.length][1];

        for (int i = 0; i < list.length; i++) {
            dataLogin[i][0] = list[i];
        }

        return dataLogin;
    }
    // buowcs 2 : load data vào test
    @Test(dataProvider = "loginData")
    public void testLoginData(LoginData data) throws InterruptedException {
        // tạo đối tụowng LoginPage
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login(data.username(), data.password());

        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), data.success());

    }


    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
        //tạo đối tợng LoginPage
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));

        // so sánh expected với actual
       Assert.assertTrue( true);


        // so sánh expected vowis actual
        String currentUrl = driver.getCurrentUrl();
        System.out.print(currentUrl);
        Assert.assertTrue(currentUrl.contains("dashboard"));

    }
}
