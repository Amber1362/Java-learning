public class Manager extends Employee {
    String company = "Google";

    void work() {
        System.out.println("Child company: " + company);
        System.out.println("Parent company: " + super.company);

        super.work();

        System.out.println("Manager is managing the team");

    }
}
