import java.util.ArrayList;

public class DynamicArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Amber");
        students.add("Amir");
        students.add("Akash");
        students.add("Asad");
        students.add("Aman");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("Size: " + students.size());
    }
}
