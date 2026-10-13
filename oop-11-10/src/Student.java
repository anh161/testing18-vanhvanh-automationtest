import java.util.Scanner;

//public: Thể hiện phạm vi truy cập của đối tượng
//private: Những nơi khác không thể truy cập được
//protected
public class Student {
// Liệt kê các thuộc tính ( biến) của đối tượng
    String id;
    String name;
    int age;
    String address;
    String phone;
    String email;
    String gender;


    // hàm khởi tạo đối tượng
    //Lưu ý; Nếu không khở tạo hàm trong java tự động khởi tạo mặc dijngd => dùng từ khóa new để tạo đối tượng

    public Student() {
       // trong hàm không có logic code => tựddoojoojng gán giá trị mặc định cho tùng thuộc tính
         id = "1";
         name = "Vanh";
         age = 20;
         address =" HCM";
         phone = " 035235";
         email = " jdgfj";
         gender = " Nữ";
    }

    //Lưu ý: Nếu dùng hàm khởi tạo có tham số thì bắt buộc tạo 1 hàm khởi tạo không tham số

    public Student(String id,
                   String name,
                   int age,
                   String address,
                   String phone,
                   String email,
                   String gender) {
        // phân biệt thuộc tính và tên của tham số => dùng this để phân biệt
        // lưu ý nếu khác tên thì k cần dùng this
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;

    }

// Liệt kê các phương tức ( function)

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ma hs: ");
        id = sc.nextLine();
        System.out.println("Moi ban nhap ten hs: ");
        name = sc.nextLine();
        System.out.println("Moi ban nhap tuoi hs: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap dia chi hs: ");
        address = sc.nextLine();
        System.out.println("Moi ban nhap phone hs: ");
        phone = sc.nextLine();
        System.out.println("Moi ban nhap email hs: ");
        email = sc.nextLine();
        System.out.println("Moi ban nhap gender hs: ");
        gender = sc.nextLine();
    }

    public void display(){
        System.out.println("Mã HS " + id);
        System.out.println("Tên HS " + name);
        System.out.println("Tuổi HS" + age);
        System.out.println("dia chỉ HS " + address);
        System.out.println("phone hs: " + phone);
        System.out.println("email hs: " + email);
        System.out.println("Gender hs: " + gender);

    }
}
