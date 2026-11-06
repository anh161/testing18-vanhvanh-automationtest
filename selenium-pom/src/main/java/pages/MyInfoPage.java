package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class MyInfoPage extends BasePage{
    private static final By AVATA_IMG = By.xpath("//img[@class='employee-image']");
    private static final By UPLOAD_BTN = By.xpath("//button[contains(@class, 'employee-image')]");
    private static final By FILE_INPUT = By.xpath("//input[@type='file']");
    private static final By SAVE_BTN = By.xpath("//button[@type='submit']");
    private static final By SUCCESS_TOAST = By.id("oxd-toaster_1");
    public MyInfoPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void open() throws InterruptedException {
        By myInforLocator = By.xpath("//span[text()='My Info']");
        WebElement myInfoMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(myInforLocator));
        myInfoMenu.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AVATA_IMG));
    }


    public void uploadAvata(String imageName) throws InterruptedException {
        WebElement avataImg = wait.until(ExpectedConditions.elementToBeClickable(AVATA_IMG));
        avataImg.click();

        WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(UPLOAD_BTN));
        uploadBtn.click();

        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(FILE_INPUT));
        String filePath = new File("src/test/resources/images/" + imageName).getAbsolutePath();
        fileInput.sendKeys(filePath);
        Thread.sleep(2000);

        WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(SAVE_BTN));
        saveBtn.click();

    }
    public boolean isSuccessUpload(){
        WebElement successToast = wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_TOAST));
        return successToast.isDisplayed();
    }

    }



