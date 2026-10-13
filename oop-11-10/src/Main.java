import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Main  {

    public static void main(String[] args) {
// Tạo đô tượng Studen
        Student hs1 = new Student();
/*       hs1.id = "123456";
        hs1.age = 20;
        hs1.email = "a@gamil,com";
        hs1.name = "Vanh";
        System.out.println(hs1.id);
        System.out.println(hs1.age);
        System.out.println(hs1.email);
        System.out.println(hs1.name);*/
 //       hs1.input();
//        hs1.display();
        System.out.println("==============");
        Student hs2= new Student();
 //       hs2.input();
//        hs2.display();

        Student hs3 = new Student("3", "Vanh", 20, "HCM", "0236", "hf@gmail.com" , "nu");
// tạo danh sách học sinh
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(hs1);
        listStudents.add(hs2);
        listStudents.add(hs3);
        //in ra màn hình
        for (Student student : listStudents) {
            student.display();
            System.out.println("=================");
        }

         System.out.println("Example for automation test");
        LoginPage loginPage = new LoginPage();
        loginPage.login("admin", "123456");
        // TODO: function để kiểm tra result thực tế với result mong đợi
        if(loginPage.isLoginSuccess()){
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        // luwu ys khoong dduwowjc dung class cha vif class cha chir ddeer kees thuwfa
        Car mec = new Car("1", "Mayback", "Mayback 2020", "Den", 4, "xang");
        mec.display();

    }
}
