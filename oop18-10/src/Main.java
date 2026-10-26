//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // tài khoản ngân hàng
        // tài khoản tiết kiệm ( savingg accout) không đuộc rút quá số dư trong tk
        // checking accont : rút tối đa 1.000.000
        //Account => class cha
        // saving account => class con
        // checking account => class con

        SavingAccount account1 = new SavingAccount(1_000_000, "An");
        account1.withdraw(2_000_000);
        System.out.println(account1.getBalance();

        CheckingAccount account2 = new CheckingAccount(1_000_000, "Bifnh");
        account2. withdraw(1_000_000);
    }
}