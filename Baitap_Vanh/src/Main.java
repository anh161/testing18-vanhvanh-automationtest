import java.util.Scanner;


public class Main {


    // Bài 1
    // Khai báo phương thức tĩnh xoaNguyenAm nhận vào chuỗi str và trả về String
    public static String xoaNguyenAm(String str) {
        if (str == null) return null;
        // Khởi tạo StringBuilder để chứa kết quả (giúp tối ưu bộ nhớ khi nối chuỗi trong Java)
        StringBuilder result = new StringBuilder();

        // Chuỗi chứa toàn bộ nguyên âm cần kiểm tra (bao gồm cả chữ thường và chữ hoa)
        String vowels = "aeiouAEIOU";

        // Vòng lặp for duyệt từ đầu đến cuối chuỗi đầu vào
        for (int i = 0; i < str.length(); i++) {
            // Lấy ký tự tại chỉ số i
            char c = str.charAt(i);

            // vowels.indexOf(c) trả về -1 nếu ký tự c KHÔNG xuất hiện trong chuỗi vowels
            if (vowels.indexOf(c) == -1) {
                // Nếu c không phải nguyên âm, thêm c vào kết quả
                result.append(c);
            }
        }

        // Chuyển StringBuilder thành String và trả về kết quả
        return result.toString();
    }

    // bài 2: tm số lớn thứ 2 trong mảng
    public static int timLonThuHai(int[] arr) {
        // Kiểm tra nếu mảng null hoặc có ít hơn 2 phần tử
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE; // Trả về giá trị đặc biệt theo yêu cầu đề bài
        }

        // Khởi tạo max1 và max2 với giá trị nhỏ nhất có thể của kiểu int
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Duyệt qua từng phần tử trong mảng
        for (int num : arr) {
            // Nếu tìm thấy phần tử lớn hơn max1 hiện tại
            if (num > max1) {
                max2 = max1; // Giá trị lớn nhất cũ lùi xuống làm giá trị lớn thứ hai
                max1 = num;  // Cập nhật giá trị lớn nhất mới
            }
            // Nếu num nằm trong khoảng giữa max2 và max1 (nhỏ hơn max1 nhưng lớn hơn max2)
            else if (num > max2 && num < max1) {
                max2 = num;  // Cập nhật giá trị lớn thứ hai mới
            }
        }

        // Trả về giá trị lớn thứ hai (nếu không tìm thấy sẽ vẫn là Integer.MIN_VALUE)
        return max2;
    }


    // Bài 3: Tính tổng các số chăng
    public static void tinhTongSoChan(){
        Scanner sc = new Scanner(System.in);
        //Nhập số từ bàn phím
        System.out.println (" Nhập vào số nguyên dương : ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println(" Lỗi số nhập vào là sô âm, không hợp lệ ");
        } else {
            int sum = 0;
            for (int i = 0 ; i <= n; i+=2){
                sum += i;
            }
            System.out.println("Tổng các số chn từ 0 đến " + n + " là " + sum);

        }
    }


    //bài 4: đếm các tuừ trong 1 chuỗi
    public static void demSoTu() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập vào một chuỗi : ");
        String str = sc.nextLine();

        //Kiểm tra TH chuỗi null hoặc chỉ có khoảng trống
        if (str == null || str.trim().isEmpty()) {
            System.out.println(" Số từ trong chuỗi là 0 ");
        } else {
            //1, str.trim(): Xóa khoảng trắng thừa ở đầu và cuối
            //2. split("\\s+")  Cắt chuỗi thành mảng các từ tại vị trí có 1 hoặc nhiều khoảng trắng
            String[] cacTu = str.trim().split("\\s+");
            int soTu = cacTu.length;
            System.out.println("Số từ trong chuỗi là " + soTu );
        }

    }


    // Bài 5: In chữ cái đầu của mỗi chuỗi
    public static void inChuCaiDau(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập vào một chuỗi");
        String str = sc.nextLine();

        //Kiểm tra chuỗi null hoặc trống
        if (str == null || str.trim().isEmpty()) {
        System.out.println(" Chuỗi nhập vào rỗng");
        } else {
            // 1. str.trim(): Xóa khoảng trắng thừa ở đầu và cuối
            // 2. split("\\s+"): Cắt chuỗi thành mảng các từ tại vị trí có 1 hoặc nhiều khoảng trắng
            String[] cacTu = str.trim().split("\\s+");

            StringBuilder ketQua = new StringBuilder();
            for (int i = 0; i < cacTu.length; i++) {
                ketQua.append(cacTu[i].charAt(0));
                // Thêm khoảng trắng giữa các chữ cái (trừ từ cuối cùng)
                if (i < cacTu.length - 1) {
                    ketQua.append(" ");
                }
            }

            System.out.println("Kết quả: " + ketQua.toString());
        }

    }


    // Bài 1 - cấp độ 2: Tính số thuế thu nhập cá nhân
    public static void tinhTienThueTNCN(float soThuNhap) {
        if (soThuNhap < 0) {
            System.out.println(" Số thu nhập không hợp lệ");
            return;

        }
        double thuePhaiTra = 0;
        double roundThuNhap = Math.ceil(soThuNhap); //làm tròn số tiền thu nhập
        if (roundThuNhap <= 5) {
            thuePhaiTra = roundThuNhap * 0.05;
        } else if (5 < roundThuNhap && roundThuNhap <= 10) {
            thuePhaiTra = (5 * 0.05) + ((roundThuNhap - 5) * 0.1);
        } else if (10 < roundThuNhap && roundThuNhap <= 18) {
            thuePhaiTra = (5 * 0.05) + (5 * 0.1) + ((roundThuNhap - 10) * 0.15);
        } else if (18 < roundThuNhap && roundThuNhap <= 32) {
            thuePhaiTra = (5 * 0.05) + (5 * 0.1) + (8 * 0.15) + ((roundThuNhap - 18) * 0.2);
        } else if (32 < roundThuNhap && roundThuNhap <= 52) {
            thuePhaiTra = (5 * 0.05) + (5 * 0.1) + (8 * 0.15) + (14 * 0.2) + ((roundThuNhap - 32) * 0.25);
        } else if (52 < roundThuNhap && roundThuNhap <= 80) {
            thuePhaiTra = (5 * 0.05) + (5 * 0.10) + (8 * 0.15) + (14 * 0.20) + (20 * 0.25) + ((roundThuNhap - 52) * 0.30);
        } else {
            thuePhaiTra = (5 * 0.05) + (5 * 0.10) + (8 * 0.15) + (14 * 0.20) + (20 * 0.25) + (28 * 0.30) + ((roundThuNhap - 80) * 0.35);

        }
        System.out.println(" Thuế phải trả là : " +thuePhaiTra + " triệu đồng");
    }





    public static void main(String[] args) {
        // Chạy thử với các ví dụ bài 1
        System.out.println("Chuỗi sau khi xóa nguyên âm là: " + xoaNguyenAm("Cybersoft"));
        System.out.println("Chuỗi sau khi xóa nguyên âm là: " + xoaNguyenAm("hello"));

        // chạy thử với các ví dụ bài 2
        int[] input1 = {1, 3, 4, 5, 0, 2};
        int[] input2 = {10, 5, 10};
        int[] input3 = {3};
        int[] input4 = {1, 2, -3, 4};

        System.out.println("Số lớn thứ 2 trong mảng là: " + timLonThuHai(input1)); // Output: 4
        System.out.println("Số lớn thứ 2 trong mảng là: " + timLonThuHai(input2)); // Output: 5
        System.out.println("Số lớn thứ 2 trong mảng là: " + timLonThuHai(input3)); // Output: -2147483648 (Integer.MIN_VALUE)
        System.out.println("Số lớn thứ 2 trong mảng là: " + timLonThuHai(input4)); // Output: 2

        // chạy thử bài 3
        tinhTongSoChan();

        // chạy thử bài 4

        demSoTu();

        // chạy thử bài 5
        inChuCaiDau();


        // chạy thử bài 1 - câ 2
        float soThuNhap = 50.5f;
        tinhTienThueTNCN(soThuNhap);


    }
}