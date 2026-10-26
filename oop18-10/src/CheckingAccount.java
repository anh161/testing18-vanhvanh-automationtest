public class CheckingAccount extends Account {
    private static final double OVERDAFT_LIMIT = 1_000_000;
    public CheckingAccount(double balance, String ower){
        super(balance, ower);
    }

    @Override
    public void withdraw( double amout){
        if (amout <= 0 || amout > OVERDAFT_LIMIT) {
            throw new IllegalAccessException(" Invalid amout");
        }
        setBalance(getBlance() - amout);
        System.out.println(" Withdraw successful");
    }
}
