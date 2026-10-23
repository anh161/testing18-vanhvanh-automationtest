public class Main {
    public static void main(String[] args) {
// baif 1
        Employee[] listEmployees = {
            new FullTime( "F01", "An", 10_000_000, 5_000_000),
            new PartTime( "P01", "Binh" , 10, 500_000)

        };
        for (Employee e : listEmployees) {
            System.out.println(e.getName() + " - " + e.calculateSalary());
        }
    }
}