package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    }

    // hàm tearDown môi trờng sau khi chạy test
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
