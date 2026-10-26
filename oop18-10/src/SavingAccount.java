public class SavingAccount extends Account{
    public SavingAccount(double balance, String ower){
        super(balance, ower);
    }
    @Override
    public void withdraw(double amount){
        if (amount <= 0 || amount > getBlance() ){
            throw new IllegalAccessException("Invalid amount ");}
        setBalance(getBalance() - amount);
        System.out.println(" Withdraw successful");
    }
}
