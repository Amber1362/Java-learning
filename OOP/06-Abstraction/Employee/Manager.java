public class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println("Manager is managing the team.");
    }
}
