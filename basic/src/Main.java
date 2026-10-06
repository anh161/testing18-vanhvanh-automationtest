import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
//        ctrl +
//        1. Câu lệnh nhập xuất dữ liệu
//         xuất dữ liệu
//         cuối câu có dấu ;
        System.out.println("hello World");



        // biến( variable) lấy dữ liệu truyền sẽ lưu thành bến rồi gọi ra -- biến thường được lưu trong thanh RAM
        // <kiểu dữ liệu> <tên biến>;
        // <kiểu dữ liệu> <tên biến> = <giá trị mặc định>;
        // quy tắc đặt tên biến của java : camel case
        // VD: sonNguyen, hocSinh
        int num1 =10;
        System.out.println(num1);
        float num2 = 10.5f;
        System.out.println(num2);
        boolean isAcyive = true;
        System.out.println(isAcyive);
        char ch= 'a';
        String str = "Hello World";
        System.out.println(str);


        // 2. các toán tử
        //2.1. phép toan: + - * /( lấy nguyên), % ( lấy dư)
        // VD: cppjng số nguyên, công số thực, nối chuỗi

        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println("Tổng 2 số nguyên là : " + result);


        int number3 = number1++; // ++ là tăng gi trị biến đó lên 1 đơn vị ( tăng number1 lên 1)
        // thay thế cho number1 = number1 + 1
        // ++ ở trước: gán giá trị của number1 vào number 3 sau đó tăng giá trị của number1 lên 1 đơn vị
         System.out.println("number3=" + number3 );
        System.out.println("number1=" + number1 );

        int number4 = ++number2;
        // ++ ở sau: tăng giá trị number 2 lên 1 sau đó gán cho number 4
        // number2=number4=21


        // phép trừ  tương tự
        //có number-- và --number ( chỉ cộng trừ có cú pháp này, phép nhn chia k có  )

        number1 +=10; // number1 = number1 +10( phesp * % cos cus phasp nay)
        number1 -=10;// number1 = number1 -10
        number1 = number2+10;// 2 biếm thì phải ghi đầy đủ
        number1 /=10;
        number1 %=10;

        // hằng số (constant) -> biến lưu giá trị không đổi ví dụ số pi hoặc 1 đường dẫn nào đó
        final int TIMEOUT = 1000; // Thường tên biến hằng số là viết in hoa
        // gán TIMEOUT = 10 => lỗi
        //



        //2.2. so sánh : >, >=, <, <=, ==, !=( khác), !( phủ định)

        // kết quả trả về là : boolen ( true, false)
        boolean isGreater = 10>5;
        boolean isEqual = 10==10;
        // đi kèm với condition statement, lop statement

        // 2.3. nối điều kiện: &&, ||

        // Kết quả trả về là dạng boolean
        boolean isCheck  = (10>5) && (10<20);

        // true khi 2 hoặc nhiều điều kieenuj cùng true
        // true && true => true
        // true&& false => false


        boolean isCheck2  = (10>5) || (10<20);
        // false khi 2 hoặc nhiều điều kieenuj cùng fale
        // true && true => true
        // true&& false => true
        // false && true => true

        //3. Nhập dữ liệu -> nhập dữ liệu từ bàn phím
        // Scanner (dđối tượng có sẵn của java)

        Scanner sc = new Scanner(System.in);
        // nhập số nguyên
        // next .. => nhập hàm bất đồng bộ
        // bắt user nhập giá trị từ bàn phím và gõ Enter rồi mới xử lý

        // muốn gọi API -> dùng cơ chế bất đồng bộ (đợi kết quả của API trả v)
        System.out.println(" Moi ban nhap so nguyen:");
        int number5 = sc.nextInt();

        System.out.println(" So nguyen ban nhap la:" +number5);
        System.out.println("moi ban nhap so thuc" );
        float number6 = sc.nextFloat();
        System.out.println(" So nguyen ban nhap la:" +number6);

        sc.nextLine();
        System.out.println("moi ban nhap chuỗi");
        String str1 = sc.nextLine();
        System.out.println(" Chuoi ban nhap la: " +str1);
//         int number5 = Integer.parseInt(sc.nextLine());//( chuyển kiểu dữ liệu)
//        System.out.println(" so nguyen ban nhap la" +number5);
//         System.out.println(" moi ban nhap so thuc");
//         float number6 = Float.parseFloat(sc.nextLine());
////         System.out.println(" so thuc ban nhap la" +number6);
//
//        // khai báo mảng
//        // mảng số liệu
//        // <kiểu dữ liệu>[]<tên biến> = new <kiểu dữ liệu>[<số lượng phần tử>]
//        // int[] arr = new int[5]
//        int[] arr= {1, 2, 3, 4, 5, 6,};
//        String[] danhsachTen = {"Nguyen", "Hieu", "Tran"};
//        System.out.println(danhsachTen[0]);
//        System.out.println(danhsachTen[2]);
//        int lengthDST = danhsachTen.length;
//        System.out.println(danhsachTen[lengthDST-1]);

        // condition statement
        // if(<bieu thuc dieu kiện>){
        // logic nằm trong này
        // }



//      bài 1: Kiểm tra điểm thi đại học. nếu dưới đểm chuẩn => false
//      mô hình 3 khối
//      input? =>
//      - Điểm thi đại học
//      - Điểm chuẩn
//      output? => pass/fail
//      process( cách giải)
//      TH1: Nếu điểm thi >= iểm chuẩn => pass
//      TH2: Nếu điểm thi < điểm chuaamr => fail
//      TH3: Kiểm tra kiêru dữ liệu, kiểm tra range dữ liệu
        System.out.println("Mời bạn nhập điểm thi đai học");
        int diemThi = Integer.parseInt(sc.nextLine());

//      TH3: tạm thời skip
//      Kiểm tra điều kiện fail trước
        if (diemThi < 1 || diemThi > 10) {
            System.out.println("diem thi khong hop le");
        }
//      iff ( 0 <=diemThi&& diemThi <=10){
//        System.out.println("diem thi khong hop le");}
        System.out.println("Mời bạn nhập điểm chuẩn");
        int diemChuan = Integer.parseInt(sc.nextLine());
        if (diemThi >= diemChuan) {
            System.out.println("PASS");
        } else {
                System.out.println("FAIL");
        }
        if (diemChuan < 1 || diemChuan > 10) {
            System.out.println("diem chuan khong hop le");
        }
//      bai2: tìm số lớn nhấ trong 3 số : 4,8,2
//        int[] arr= {4, 8, 2};
//        if ()

//        public static voZZZZZZ  NN N n


    }
}