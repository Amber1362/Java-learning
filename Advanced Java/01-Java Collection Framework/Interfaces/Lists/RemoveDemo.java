import java.util.ArrayList;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Sani");
        students.add("Bhavesh");
        students.add("Vidhi");
        students.add("Amber");

        System.out.println("Before removing element at index 1: ");
        for (String student : students) {
            System.out.println(student);
        }

        students.remove(1);
        System.out.println();

        System.out.println("After removing element at index 1: ");
        for (String student : students) {
            System.out.println(student);
        }
    }
}