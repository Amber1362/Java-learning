class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Developer extends Employee {
    void work() {
        System.out.println("Developer is writing code.");
    }

    void fixBug() {
        System.out.println("Developer is fixing bugs.");
    }
}

class Designer extends Employee {
    void work() {
        System.out.println("Designer is creating UI.");
    }
}

class Tester extends Employee {
    void work() {
        System.out.println("Tester is testing software.");
    }
}

public class MiniProject {
    public static void main(String[] args) {
        Employee emp1 = new Developer();
        Employee emp2 = new Designer();
        Employee emp3 = new Tester();

        emp1.work();
        emp2.work();
        emp3.work();
        
        Developer dev = (Developer) emp1;
        dev.fixBug();

        Employee emp = new Designer();

        if(emp instanceof Developer) {
            Developer d = (Developer) emp;
            d.fixBug();
        } else {
            System.out.println("Not a developer");
        }
    }
}
