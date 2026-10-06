import java.util.Scanner;

public class Main {

    // 1. Hàm tính chu vi, diện tích đặt riêng ở ngoài main
    public static void chuViDienTich(float dai, float rong) {
        if (dai < 0 || rong < 0) {
            System.out.println("Chieu dai, chieu rong khong duoc am");
            return;
        }
        float chuVi = 2 * (dai + rong);
        float dienTich = dai * rong;
        System.out.println("Chu Vi: " + chuVi);
        System.out.println("Dien Tich: " + dienTich);
    }


    // bai2 tim so lon nhat tronf 3 so
    public static void soLonNhat(int num1, int num2, int num3){
        int maximum =num1;
        if(maximum>num2){
            maximum=num2;
        }
        if(maximum>num3){
            maximum=num3;
        }

        System.out.println(" so lon nhat la:" + maximum);
    }

    //bai3 tim diem trung binh
    public static void kiemTraDiemTrungBinh(float dtb) {
        // Kiểm tra điều kiện điểm hợp lệ (0 - 10)
        if (dtb < 0 || dtb > 10) {
            System.out.println("Diem trung binh khong hop le (phai tu 0 den 10)!");
            return;
        }

        // Process: Phân loại học lực
        if (dtb >= 9.0) {
            System.out.println("Hoc luc: Xuat sac");
        } else if (dtb >= 8.0) {
            System.out.println("Hoc luc: Gioi");
        } else if (dtb >= 6.5) {
            System.out.println("Hoc luc: Kha");
        } else if (dtb >= 5.0) {
            System.out.println("Hoc luc: Trung binh");
        } else {
            System.out.println("Hoc luc: Yeu");
        }
    }


    //bai4 : tinh tien dien
    //bac 1: 1-50kWh ->1800
    //bac2: 51-100 -> 2000
    //bac3: 101-200 -> 2500
    //bac4: 3000
    // tuong dong 1 so bai tap tisnh tien thue , tien taxxui

    public static void tinhTienDien(float sokWh){
        if(sokWh<0){
            System.out.println(" so kWh khong hop le");
            return;
        }
        int tienDien =0;
        double roundTienDien = Math.ceil(sokWh);
        if (roundTienDien<=50){
            tienDien = (int) (1800 *roundTienDien);
        } else if (51<=roundTienDien && roundTienDien<=100){
            tienDien = 1800*50 + (int)(2000 *(roundTienDien-50));
        }else if (101<=roundTienDien && roundTienDien<=200){
            tienDien = (1800*100) + (2000 *50) + (int)(2500 *(roundTienDien-100));
        }else {
            tienDien = (1800*100) + (2000 *50) + (2500 * 100) + (int)(3000 *(roundTienDien-200));
        }
        System.out.println("tienDien: " + tienDien);
    }

// vong lap
    // bai1 in cac so tu 1 den 100
    public static void inSoTu1Den100(){
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
    }


    // bai2 in cac so chan tu 0 den 100
    public static void inSoChanTu0Den100(){
        for(int i=0;i<=100;i+= 2){
            System.out.println(i);
        }
    }

    //bai3 tinh tong 1 den 300
    public static void sum1To300(){
        int sum =0;
        for(int i=1;i<=300;i++){
            sum +=i;
        }
        System.out.println("sum 1 to 300" +sum);
    }

    //bai4 in bang cuu chuong 5
    public static void cuuChuong5(){
        // bat dau vong lap i =1, ddieeuf kieenj i <= 10, buoc nhay i++
        for( int i=1; i <= 10 ; i++){
            System.out.println("5 x" + i + "=" + (5 *i));
        }
    }


    //bai5 tinh gia thua cua n
    //VD 3! = 6,...
    // n! = n*(n-1)*(n-2) *...*2*1
    public static void giaiThua(int n){
        // dieu kien bat dau vong lap i=1
        // dieu kien dung i <= n
        // buoc nhay i++
        if ( n<=1){
            System.out.println("n khong hop le");
            return;
        }
        int result =1;
        for (int i = 2; i <= n; i++) {
            result *=i;
        }
        System.out.println("giai thua " + result);
    }



    // 2. Hàm main duy nhất của chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("bai 1 tinh chu vi dien tich hinh chu nhat ");
        System.out.print("Nhap chieu dai:");

        // Sửa 'float.parseFloat' thành 'Float.parseFloat'
        float dai = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap chieu rong:");
        float rong = Float.parseFloat(sc.nextLine());

        // Gọi hàm
        chuViDienTich(dai, rong);

        // bai2 tim so lon nhat tron 3 so
        int num1 = 4;
        int num2 = 2;
        int num3 = 1;
        soLonNhat(num1, num2, num3);

        //bai 3; kiem tra hoc luc cua hoc sinh dua vao diem trung binh
        //input: diem cua hoc sinh + diem trung binh
        //out put: hoc luc : suat sac, trung binh, kha
        // process:
            System.out.println("--- Bai 3: Kiem tra hoc luc ---");
            System.out.print("Nhap diem trung binh cua hoc sinh: ");
            //float dtb = 10.5f;
            // Nhập điểm trung bình từ bàn phím
           float dtb = Float.parseFloat(sc.nextLine());

            // Gọi hàm kiểm tra điểm trung bình vào hàm main
            kiemTraDiemTrungBinh(dtb);

            float roundTienDien = 50.5f;
            tinhTienDien(roundTienDien);
    }
}