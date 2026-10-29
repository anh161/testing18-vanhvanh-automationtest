package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.ConfigReader;

import java.time.Duration;

// BaseTest là class để thiêết lập môi trường chạy test
public class BaseTest {
    protected WebDriver driver ;
    protected WebDriverWait wait;


    //hàm setup môi trường test
    //thêm key beforMethod để chạy hàm này trước khi chạy test
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        //DriverManager.chromedriver().setup();Web
        //cấu hình giao diện cho chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver();
        int timeout = Integer.parseInt(ConfigReader.get("timeout"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }

    // hàm tearDown môi trờng sau khi chạy test
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }

    // vì các page con cdeeuf cần login trước lên cần dèine funtion login trong class cha
    protected void loginAdmin() throws  InterruptedException {
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));
        wait.until(ExpectedConditions.urlContains("dashboard")); //sai chinh ta dashboard
    }
}
