public class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println("Developer is writing code.");
    }
}
