package BankingManagment;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("Rahul", 50000, 5);

        CurrentAccount current =
                new CurrentAccount("Priya", 20000, 10000);

        System.out.println("===== SAVINGS ACCOUNT =====");
        System.out.println(
                "Account Holder: " + savings.getAccountHolder()
        );
        System.out.println("Balance: " + savings.getBalance());
        System.out.println(
                "Interest: " + savings.calculateInterest()
        );

        System.out.println();

        System.out.println("===== CURRENT ACCOUNT =====");
        System.out.println(
                "Account Holder: " + current.getAccountHolder()
        );
        System.out.println("Balance: " + current.getBalance());

        double withdrawalAmount = 25000;

        if (current.checkOverdraft(withdrawalAmount)) {
            System.out.println(
                    "Withdrawal of " + withdrawalAmount + " is Permitted"
            );
        } else {
            System.out.println("Withdrawal is Not Permitted");
        }
    }
}
