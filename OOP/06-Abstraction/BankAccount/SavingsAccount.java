public class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        if( amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}