package test; // Thay đổi package tùy theo cấu trúc dự án của bạn

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        // Khởi tạo ChromeDriver (đảm bảo bạn đã cấu hình ChromeDriver trong hệ thống)
        driver = new ChromeDriver();

        // Phóng to cửa sổ trình duyệt tối đa
        driver.manage().window().maximize();

        // Khởi tạo WebDriverWait với thời gian chờ 10 giây
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        // Đóng trình duyệt sau khi test case chạy xong
        if (driver != null) {
            driver.quit();
        }
    }
}