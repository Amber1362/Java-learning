public abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    abstract void withdraw(double amount);
}
