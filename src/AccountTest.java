import java.util.Scanner;

public class AccountTest {

    public static void main(String args[]) {

        CheckingAccount ca = new CheckingAccount();
        ca.balance = 39993.45;
        ca.name = "Alex";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your withdrawal amount: ");
        double withdrawAmt = sc.nextDouble();
        ca.withdraw(withdrawAmt);

    }

}
