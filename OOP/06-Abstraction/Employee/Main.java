public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Developer("Rahul", 75000);
        Employee emp2 = new Manager("Priya", 95000);

        emp1.displayDetails();
        emp1.work();

        System.out.println();

        emp2.displayDetails();
        emp2.work();
    }
}
