public abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Constructor Called");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    abstract void work();
}
