import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> students = new Vector<>();

        students.add("Amber");
        students.add("Amir");
        students.add("Rahul");

        for (String student : students) {
            System.out.println(student);
        }

        students.remove("Amir");

        System.out.println("After removing Amir:");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("Size: " + students.size());
    }
}