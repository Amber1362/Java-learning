import java.util.ArrayList;
import java.util.Scanner;

public class IterableDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many students? ");
        int n = sc.nextInt();

        ArrayList<String> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name: ");
            students.add(sc.nextLine());
        }

        System.out.println();

        for (String student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}
