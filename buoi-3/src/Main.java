//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // bai 1
    //input: 1 so nguyen
    //output: so nguyen cos phai so nguyen to k
    //process
    //dieu kien bat dau vong lap: i = 2
    // dieu kien i<= n=1
    //buoc nhay : i++
    // TH1: n < 2 => 0 la so nguyen to
    //TH2 : n=2 => laf so nguyen to
    //TH3
    // + neu n% i == 0 => khoong la so nguyen to => return luoon
    // + nguwoc lai => duyejt tieeps
    public static boolean isPrime(int number) {
        if (number <2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }



 // khi khong biet dieu kien dung thi dung ham while ( vi du tinh tong cac chu so cua 1 so)
 // <dieu kien bat dau vong lap>
 // while(< dieu kien dung>){
 //code
// buoc nhay
 // };


    //bai2 tinh tong cac chu so cua 1 so
    //VD: 1234 =>10
    public  static int sumDigits(int number){
        int sum = 0;
        int numberAbs = Math.abs(number);
        while (numberAbs > 0) {
            sum += numberAbs % 10;
            numberAbs /= 10;
        }
        return sum;
    }

// in cac so trong mang
    public static void printArray(int[] listNumbers){
        for (int i = 0 ; i< listNumbers.length; i++){
            System.out.print(listNumbers[i] );
        }
    }


// in chan le
    public static void printChan(int[] listNumbers){
        for (int i = 0 ; i< listNumbers.length; i++){
            if (listNumbers[i] % 2 == 0){
                System.out.print(listNumbers[i]);
            }
        }
    }

        public static void main(String[] args) {
         // bai 1 kirm tra so co phai so nguyen to k
        // luu y: so 2 la so nguyen to nho nhat
        // ket qua tra ve cua ham phai la true false ( kieu boolean)
        int number = 2;
        boolean check = isPrime(number);
        if (check) { // java tu hieu check == true
            System.out.println("so" + number + " la so nguyen to");
        } else  {
            System.out.println("so" + number + " khong la so nguyen to");
        }
    }

   int number2 = 123;
    int sum = sumDigits(number2);
    System.out.println(" tong cac chu so cua " + number2 + "la" + sum);


    int[] listNumbers = {5,3,7,1,9,10};
    // bai 1: in cac so trong mang
}