import java.util.LinkedList;

public class LinkedListDemo {
     public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.add("Fiza");
        students.add("Sneha");
        students.add("Ariba");
        students.add("Kritika");

        for (String student : students) {
            System.out.println(student);
        }
     }
}