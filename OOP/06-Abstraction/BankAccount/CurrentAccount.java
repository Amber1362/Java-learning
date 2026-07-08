public class CurrentAccount extends BankAccount {
    
    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal Successful.");
    }
}
