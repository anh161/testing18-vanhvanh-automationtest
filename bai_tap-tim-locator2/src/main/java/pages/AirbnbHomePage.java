package pages;
imimport org.openqa.selenium.By;



public class AirbnbHomePage {

    // 1. Logo CyberSoftbnb  góc trên bên trái
    public static By logoCyberSoft = By.xpath("//img[@alt='Cyber Logo']");

    // 2. Link menu điều hướng "Home" trên Header
    public static By menuHome = By.xpath("//nav//a[text()='Home']");

    // 3. Link menu điều hướng "About" trên Header
    public static By menuAbout = By.xpath("//nav//a[text()='About']");

    // 4. Icon User profile ở góc trên bên phải
    public static By iconUserProfile = By.xpath("//img[contains(@src, 'flaticon')]");

    // 5. Ô chọn "Địa điểm / Bạn sắp đi đâu?"
    public static By inputLocation = By.xpath("//p[contains(text(), 'Bạn sắp đi đâu')]");

    // 6. Ô chọn ngày "07/12/2024 - 14/12/2024" (hoặc khu vực chọn ngày tháng)
    public static By inputDateRange = By.xpath("//div[contains(@class, 'col-span-4')]//p");

    // 7. Nút Tìm kiếm (Icon kính lúp màu hồng)
    public static By btnSearch = By.xpath("//span[@aria-label='search']");

    // 8. Nút tăng số lượng khách (+) trong popup
    public static By btnPlusGuest = By.xpath("//button[.//div[text()='+']]");

    // 9. Nút giảm số lượng khách (-) trong popup
    public static By btnMinusGuest = By.xpath("//button[.//div[text()='-']]");
    // 10. Card điểm đến nổi bật "Hồ Chí Minh"
    public static By cardHoChiMinh = By.xpath("//div[contains(@class, 'ant-card')]//h2[text()='Hồ Chí Minh']/ancestor::a");
    // 11. Tiêu đề "Cần Thơ" trong thẻ điểm đến
    public static By textCanThoTitle = By.xpath("//h2[text()='Cần Thơ']");

    // 12. Nút lọc "Loại nơi ở" (Filter button)
    public static By btnFilterType = By.xpath("//button[contains(@class, 'rounded-lg') and contains(text(), 'Loại nơi ở')]");

    // 13. Nút lọc "Giá" (Filter button)
    public static By btnFilterPrice = By.xpath("//button[contains(@class, 'rounded-lg') and contains(text(), 'Giá')]");
    // 14. Đoạn text "6.5 giờ lái xe" trong card
    public static By textDrivingTime = By.xpath("//h2[text()='Nha Trang']/following-sibling::p");
}
