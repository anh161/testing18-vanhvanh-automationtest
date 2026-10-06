//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // moo hifnh 3 khoois
    // baif 1 tisnh chu vi và diện tích hình chữ nhật
    public static void chuViDienTich(float dai, float rong){
        //TH1 : dài, rong>0
        if (dai <0 || rong<0){
            System.out.println("Chieu dai, chieu rong khong duoc am");
            return;
        }
        float chuVi = 2 * (dai + rong);
        float dienTich = dai * rong;
        System.out.println(" Chu Vi: " + chuVi);
        System.out.println(" Dien Tich: " + dienTich);
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

        System.out.println(" so lon nhat la:" + maximum)
    }

    public static void main(String[] args) {
        //bai1 tính chu vi điện tich
        Scanner sc = new Scanner(System.in);
        System.out.print("bai 1 tinh chu vi dien tich hinh chu nhat ");
        System.out.print(" Nhap chieu dai:");
        // phải parse từ string sang number vì sau này sẽ nhập cả số và chư
        float dai = float.parseFloat(sc.nextLine);
        System.out.print(" Nhap chieu rong:");
        float rong = float.parseFloat(sc.nextLine);
        // gọi hàm chuvi dienj tích
        chuViDienTich(dai, rong);

        // bai2 tim so lon nhat tron 3 so
         int num1 = 4;
         int num2 = 2;
         int num3 = 1;
         soLonNhat(num1, num2, num3);
    }
  }
