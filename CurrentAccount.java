package BankingManagment;
public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(
            String accountHolder,
            double balance,
            double overdraftLimit
    ) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean checkOverdraft(double withdrawalAmount) {
        return withdrawalAmount > 0
                && withdrawalAmount <= getBalance() + overdraftLimit;
    }
}