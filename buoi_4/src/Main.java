import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {

    //collection trong java
    public static void  learningCollection(){
        //mảng trong collection
        Integer[] arr  = {4, 2, 6, 8, 9};

        //foat => Float
        //int => Integer
        //double => Double
        List<Integer> listInt = new ArrayList<>(Arrays.asList(arr));

        String[] arrStr = {"4", "2", "6", "8", "9"};
        List<String> listStr = new ArrayList<>(Arrays.asList(arrStr));

        //1. sắp xếp mảng số nguyên
        // tăng dần
        Collections.sort(listInt);
        System.out.println(listInt);

        //giảm dần
         Collections.sort(listInt,Collections.reverseOrder());
         System.out.println(listInt);


        // Đảo ngược mang
        Collections.reverse(listInt);
        System.out.println(listInt);





        // tìm min/max
        System.out.println("Max: " + Collections.max(listInt));
        System.out.println("Min: " + Collections.min(listInt));

        //dđếm số lần xuất hiện item bất kì
        System.out.println("Sum: " + Collections.frequency(listInt,9));

        // Thêm, xóa, sửa item trong lis
        // Thêm item vào cuối listStr
        listStr.add("hello");
        listStr.add( 1, "vanh");
        System.out.println(listStr);

        // Đọc item
        System.out.println(listStr.get(1));

        //upadte
        listSTr.set(0, "Hello");
        System.out.println(listStr);

        //Xóa item
        // xóa theo index
        listStr.remove(0);
        System.out.println(listStr);
        // Xóa theo item
        listStr.remove("world");
        System.out.println(listStr);

    }




    public static void main(String[] args) {
        learningCollection();



    }
}
