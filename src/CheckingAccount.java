public class CheckingAccount {
    public double balance;
    public String name;

    public void withdraw(double withdrawAmt) {

        if (withdrawAmt > balance) {
            System.out.println("Warning: you do not have enough");
        }
        else {
            balance -= withdrawAmt;
            System.out.println("Successful withdrawal");
            System.out.println("Remaining balance: " + balance);
        }

    }

}
