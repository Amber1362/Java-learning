import java.util.Scanner;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       BankAccount account = new BankAccount();

       System.out.print("Enter deposit amount: ");
       double depositAmount = sc.nextDouble();

       account.deposit(depositAmount);

       System.out.print("Enter withdrawal amount: ");
       double withdrawAmount = sc.nextDouble();

       account.withdraw(withdrawAmount);

       account.checkBalance();

       sc.close();
    }
}
