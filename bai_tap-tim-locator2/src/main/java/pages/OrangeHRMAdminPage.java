package pages;
import org.openqa.selenium.By;

public class OrangeHRMAdminPage {
    // 1. Menu Admin
    public static By menuAdmin = By.xpath("//span[text()='Admin']/parent::a");
    //2 Menu "PIM" (Sidebar bên trái)
    public static By menuPIM = By.xpath("//span[text()='PIM']/parent::a");
    //3 Menu "Leave" (Sidebar bên trái)
    public static By menuLeave = By.xpath("//span[text()='Leave']/parent::a");
    //4 Ô input nhập "Username" (Form tìm kiếm)
    public static By userName = By.xpath("//label[text()='Username']/ancestor::div[contains(@class, 'oxd-input-group')]//input");
    //5 Dropdown "User Role" (Form tìm kiếm)
    public static By userRole = By.xpath("//label[text()='User Role']/ancestor::div[contains(@class, 'oxd-input-group')]//div[contains(@class, 'oxd-select-text')]");
    //6 Option "Admin" trong dropdown User Role
    public static By dropdownAdmin = By.xpath("//label[text()='User Role']/ancestor::div[contains(@class, 'oxd-input-group')]//div[@class='oxd-select-text-input' and text()='Admin']");
    //7 Option "ESS" trong dropdown User Role
    public static By dropdownUserRole = By.xpath("//label[text()='User Role']/ancestor::div[contains(@class, 'oxd-input-group')]//div[@class='oxd-select-text-input' and text()='ESS']");
    //8 Ô input nhập "Employee Name"
    public static By employeeName = By.xpath("//label[text()='Employee Name']/ancestor::div[contains(@class, 'oxd-input-group')]//input");
    //9 Nút "Reset" (Form tìm kiếm)
    public static By reset = By.xpath("//button[text()=' Reset ']");
    //10 Nút "Search" (Form tìm kiếm)
    public static By search = By.xpath("//button[text()=' Search ']");
    //Menu Top tab "User Management"
    public static By reset = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and contains(text(), 'User Management')]");
    //12 Checkbox dòng thứ 2 (Username "asdasd")
    public static By checkboxasdasd2 = By.xpath("//div[@role='row'][.//div[text()='asdasd']]//input[@type='checkbox']");
    //13 Ô giá trị User Role ("ESS") ở dòng thứ 2
    public static By userRole2 = By.xpath("(//div[@role='row'])[3]//div[text()='ESS']");
    //14 Nút icon Xóa (Thùng rác) ở dòng thứ 2
    public static By trashIcon2 = By.xpath("(//div[@role='row'])[3]//button[.//i[contains(@class, 'bi-trash')]]");
    //15 Nút icon Sửa (Bút chì) ở dòng thứ 2
    public static By editIcon2 = By.xpath("(//div[@role='row'])[3]//button[.//i[contains(@class, 'bi-pencil-fill')]]");
    //16 Tiêu đề cột "User Role" trên header bảng
    public static By hearderUserRole = By.xpath("//div[@role='columnheader' and text()='User Role']");
    //17 Tiêu đề cột "Employee Name" trên header
    public static By hearderEmployeeName = By.xpath("//div[@role='columnheader' and text()='Employee Name']");
    //18 Breadcrumb "Admin / User Management"
    public static By breadcrumbAdmin = By.xpath("//h6[text()='Admin']");
    //19 Nút mũi tên tròn thu gọn Sidebar(<)
    public static By iconSidebar = By.xpath("//i[contains(@class, 'bi-chevron-left')]");
    //20 Nút icon chevron thu gọn panel System Users
    public static By employeeName = By.xpath("//i[contains(@class, 'bi-caret-up-fill')]");
    //21 Nút "+ Add" thêm người dùng mới
    public static By employeeName = By.xpath("//i[contains(@class, 'bi-plus')]");





}
