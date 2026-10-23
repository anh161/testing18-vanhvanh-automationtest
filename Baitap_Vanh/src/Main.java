import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;


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
            System.out.println("Tổng các số chẵn từ 0 đến " + n + " là " + sum);
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



    // Bài 2 - Cấp độ 2
    public static boolean kiemTraChuoiDoiXung(String str) {
        if (str == null) {
            return false;
        }

        int left = 0;
        int right = str.length() - 1;

        // Dùng 2 con trỏ dịch chuyển từ 2 đầu vào giữa chuỗi
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Nếu có ký tự không khớp -> không phải đối xứng
            }
            left++;
            right--;
        }
        return true; // Duyệt hết mà khớp hết -> là chuỗi đối xứng
    }


    //Bài 3 - cấp độ 2
    public static String xoaKyTuLapLai(String str) {
        if (str == null) {
            return null;
        }

        // Sử dụng LinkedHashSet để loại bỏ trùng lặp và giữ nguyên thứ tự
        Set<Character> charSet = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }

        // Dùng StringBuilder để gom các ký tự lại thành chuỗi kết quả
        StringBuilder result = new StringBuilder();
        for (Character ch : charSet) {
            result.append(ch);
        }

        return result.toString();
    }


    //Bài 1 - cấp độ 3
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Đề bài yêu cầu trả về index bắt đầu từ 1 nên ta +1 cho mỗi vị trí
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;  // Tổng nhỏ hơn target thì tăng con trỏ trái
            } else {
                right--; // Tổng lớn hơn target thì giảm con trỏ phải
            }
        }

        return new int[] {}; // Trường hợp không tìm thấy (theo đề luôn có nên không tới đây)
    }



    // bài 2 - cấp độ 3
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Trường hợp 1: Tâm là 1 ký tự (độ dài lẻ, ví dụ: "aba")
            int len1 = expandAroundCenter(s, i, i);
            // Trường hợp 2: Tâm nằm giữa 2 ký tự (độ dài chẵn, ví dụ: "abba")
            int len2 = expandAroundCenter(s, i, i + 1);

            // Lấy độ dài lớn nhất từ 2 trường hợp trên
            int maxLen = Math.max(len1, len2);

            // Nếu tìm thấy chuỗi con đối xứng dài hơn chuỗi trước đó, cập nhật lại vị trí
            if (maxLen > (end - start)) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        // Cắt và trả về chuỗi con đối xứng dài nhất
        return s.substring(start, end + 1);
    }

    // Hàm phụ trợ: Tìm độ dài chuỗi đối xứng
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Trả về độ dài của chuỗi đối xứng tìm được
        return right - left - 1;
    }


    // Bài 3 - câ 3
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Bảng đếm tần suất ký tự của chuỗi t
        int[] targetMap = new int[128];
        for (char c : t.toCharArray()) {
            targetMap[c]++;
        }

        int left = 0, right = 0;
        int requiredType = t.length(); // Tổng số ký tự cần thỏa mãn
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            // Nếu ký tự này có trong t thì giảm số lượng cần tìm
            if (targetMap[rightChar] > 0) {
                requiredType--;
            }
            targetMap[rightChar]--;
            right++;

            // Khi đã gom đủ tất cả ký tự của t trong cửa sổ [left, right]
            while (requiredType == 0) {
                // Cập nhật lại chuỗi con ngắn nhất
                if (right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }

                // Thu hẹp cửa sổ từ bên trái
                char leftChar = s.charAt(left);
                targetMap[leftChar]++;
                if (targetMap[leftChar] > 0) {
                    requiredType++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
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


        // chạy thử bài 1 - cấp 2
        float soThuNhap = 50.5f;
        tinhTienThueTNCN(soThuNhap);


        // chạy thử bài 2 - cấp 2
        System.out.println("Input: \"madam\"");
        System.out.println("Output: " + kiemTraChuoiDoiXung("madam")); // Kết quả: true

        System.out.println("-----------------------------------");

        System.out.println("Input: \"hello\"");
        System.out.println("Output: " + kiemTraChuoiDoiXung("hello")); // Kết quả: false


        //Chạy thử bài 3 - cấp 2
        System.out.println("Input: \"programming\"");
        System.out.println("Output: \"" + xoaKyTuLapLai("programming") + "\""); // Kết quả: "progamin"

        System.out.println("-----------------------------------");

        System.out.println("Input: \"abca\"");
        System.out.println("Output: \"" + xoaKyTuLapLai("abca") + "\""); // Kết quả: "abc"


        // chạy thử bài 1 - cấp 3
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result1 = twoSum(numbers, target);

        System.out.println("Input: numbers = " + Arrays.toString(numbers) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result1)); // Kết quả: [1, 2]



        // Chạy thử bài 2 - cấp 3
        String input = "babad";
        String result2 = longestPalindrome(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result2 + "\" ");



        //chạy thử bài 3 - cấp 3
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result3 = minWindow(s, t);

        System.out.println("Input: s = \"" + s + "\", t = \"" + t + "\"");
        System.out.println("Output: \"" + result3 + "\""); // Kết quả: "BANC"

    }
}