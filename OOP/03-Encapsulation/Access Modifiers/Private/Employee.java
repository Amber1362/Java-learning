public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee name: " + name);
        System.out.println("Salary: " + salary);
    }

    void increaseSalary(double amount) {
        if(amount > 0) {
            salary += amount;
        } else {
            System.out.println("Invalid Increment");
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Amber", 50000);

        emp.displayInfo();

        emp.increaseSalary(5000);

        emp.displayInfo();
    }
}
