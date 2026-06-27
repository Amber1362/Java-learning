package bank;

public class Employee {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        System.out.println(account.balance);

        account.displayBalance();
    }
}
