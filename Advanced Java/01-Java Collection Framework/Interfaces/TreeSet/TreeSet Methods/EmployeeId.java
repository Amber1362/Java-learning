import java.util.TreeSet;

public class EmployeeId {
    public static void main(String[] args) {
        
        TreeSet<Integer> employeeId = new TreeSet<>();

        employeeId.add(105);
        employeeId.add(101);
        employeeId.add(109);
        employeeId.add(103);
        employeeId.add(107);
        employeeId.add(101);
        employeeId.add(110);

        System.out.println("Employee Id: ");
        for (Integer empId : employeeId) {
            System.out.println(empId);
        }

        System.out.println();

        System.out.println("First Employee Id: " + employeeId.first());

        System.out.println("Last Employee Id: " + employeeId.last());

        System.out.println("Employee Id above 105: " + employeeId.higher(105));

        System.out.println("Employee above 106" + employeeId.ceiling(106));

        System.out.println("Employee below 109: " + employeeId.floor(106));

        System.out.println("Removed Smallest employee id: " + employeeId.removeFirst());

        System.out.println("Removed the Largest employee id: " + employeeId.removeLast());

        System.out.println();
        System.out.println("Final TreeSet of Employees Id: ");

        for (Integer empId : employeeId) {
            System.out.println(empId);
        }
    }
}