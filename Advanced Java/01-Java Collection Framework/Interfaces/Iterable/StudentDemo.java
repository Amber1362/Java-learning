import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();
        HashSet<String> uniqueStudents = new HashSet<>();

        System.out.println("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name: ");
            String name = sc.nextLine();

            students.add(name);
            uniqueStudents.add(name);
        }

        System.out.println("All students: ");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("All unique students: ");
        for (String student : uniqueStudents) {
            System.out.println(student);
        }

        sc.close();
    }
}
