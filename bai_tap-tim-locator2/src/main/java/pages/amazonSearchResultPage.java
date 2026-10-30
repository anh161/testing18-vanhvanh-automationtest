package pages;
import org.openqa.selenium.By;

public class amazonSearchResultPage {

    //1 Ảnh sản phẩm thứ 3
    public static By imageSanPham3 = By.xpath("//div[contains(@class, 's-result-item')]//img[@class='s-image' and contains(@src, '61rJ0N2a+wL')]");
    //2 Giá tiền sản phẩm thứ 4
    public static By priceSanPham4 = By.xpath("(//*[contains(@class, 's-result-item') and @data-asin])[4]//span[@class='a-price']//span[@class='a-offscreen']");

    //3 Giá tiền sản phẩm thứ 2
    public static By priceSanPham2 = By.xpath("(//*[contains(@class, 's-result-item') and @data-asin])[2]//span[@class='a-price']//span[@class='a-offscreen']");

    //4 Ô input tìm kiếm chính đa ng chứa chữ "adidas"
    public static By searchInputAdidas = By.xpath("//div[@class='nav-search-field ']//input[@role='searchbox']");

    //5 Icon Giỏ hàng (Cart) trên Header Amazon
    public static By iconCart = By.xpath("//span[contains(@class, 'nav-cart-icon')]");

    //6 Menu điều hướng "Today's Deals"
    public static By menuTodaysDeals = By.xpath("//a[text()=\"Today's Deals\"]");

    //7 Nút "Add to cart" của sản phẩm đầu tiên
    public static By buttonAddtocard = By.xpath("(//div[contains(@class, 's-result-item') and @data-asin][1]//button[@aria-label='Add to cart'])[1]");

    //8 Tên sản phẩm 2 "Women's VL Court 3.0 Sneakers"
    public static By titleSanPham2 = By.xpath("(//a[contains(@class, 's-line-clamp-3')])[2]");

    //9 Dòng "1K+ bought in past month" của sản phẩm 1
      // không còn dòng này nữa

    //10 Nhãn thương hiệu "adidas" của sản phẩm đầu tiên
    public static By logoSanPham1 = By.xpath("(//span[contains(@class, 'a-size-base-plus a-color-base')])[1]");

    //11 Khu vực "Results" (header section kết quả tìm kiếm)
    public static By hearderResults = By.xpath("//h2[contains(@class, 'a-size-medium-plus ' ) and contains(text(), 'Results')]");

    //12 Checkbox lọc "Men" trong nhóm Gender(sidebar trái)
    public static By genderMen = By.xpath("//li[.//span[text()='Men']]//input[@type='checkbox']");

    //13 Thanh kết quả "1-48 of over 10,000 results for'adidas'"
    public static By thanhResults = By.xpath("//h2[contains(@class, 'a-size-base a-spacing-small a-spacing-top-small a-text-normal')]");

    //14 Link "See more" trong sidebarlọc
    public static By seeMoreButton = By.xpath("//a[@aria-label='See more']");

}
