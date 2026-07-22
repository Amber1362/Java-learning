import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employee = new HashMap<>();

        Employee e3 = new Employee(103, "Aman", "Finance", 60000);

        employee.put(101, new Employee(101, "Rahul", "HR", 35000));
        employee.put(102, new Employee(102, "Amber", "IT", 80000));
        employee.put(103, e3);
        employee.put(104, new Employee(104, "Virat", "Sales", 50000));
        employee.put(105, new Employee(105, "Rahul", "Marketing", 45000));

        System.out.println(employee.get(102));

        System.out.println();
        System.out.println(employee.containsKey(101));
        System.out.println(employee.containsKey(999));
        System.out.println(employee.containsValue(e3));
        System.out.println(employee.remove(104));
        System.out.println("Size: " + employee.size());

        System.out.println("All employees keys: ");
        for (Integer keyEntry : employee.keySet()) {
            System.out.println(keyEntry);
        }

        System.out.println("All employees values: ");
        for (Employee value : employee.values()) {
            System.out.println(value);
        }

        System.out.println("All employees keys and values: ");
        for (Map.Entry<Integer, Employee> emp : employee.entrySet()) {
            System.out.println(emp.getKey() + " : " + emp.getValue());
        }

    }
}
