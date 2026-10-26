public class Account {
    private boolean balance;
    private String ower;



    public boolean isBalance() {
        return balance;
    }

    public void setBalance(boolean balance) {
        this.balance = balance;
    }

    public String getOwer() {
        return ower;
    }

    public void setOwer(String ower) {
        this.ower = ower;
    }

    public  Account(){}
    public Account(double balance, String ower) {
    }

    public void deposite(double amount){
        if (amount < 0 ){
            throw new IllegalAccessException("Amount must be positive");
        }
        this.balance += amount;
    }
    abstract public void withdraw(double amount);
}
