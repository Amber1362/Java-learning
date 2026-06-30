public class EmployeeSalary {
    int baseSalary = 50000;

    void calculateSalary() {
        System.out.println(baseSalary);
    }

    void calculateSalary(int bonus) {
        System.out.println(baseSalary + bonus);
    }

    void calculateSalary(int bonus, int incentive) {
        System.out.println(baseSalary + bonus + incentive);
    }

    public static void main(String[] args) {
        EmployeeSalary empSalary = new EmployeeSalary();

        empSalary.calculateSalary();
        empSalary.calculateSalary(5000);
        empSalary.calculateSalary(5000, 3000);
    }
}
