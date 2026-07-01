public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Amber", 5000);
        BankAccount acc2 = new CurrentAccount("Rahul", 3000);

        acc1.showBalance();
        acc1.withdraw(2000);
        acc1.showBalance();

        System.out.println();

        acc2.showBalance();
        acc2.withdraw(4000);
        acc2.showBalance();
    }
}
