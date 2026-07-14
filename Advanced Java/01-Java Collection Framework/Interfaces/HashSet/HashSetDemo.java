import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<String> students = new HashSet<>();

        students.add("Amber");
        students.add("Amir");
        students.add("Rahul");
        students.add("Amber");
        students.add("Shreyash");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Size of students: " + students.size());

        if(students.contains("Rahul")) {
            students.remove("Amir");
        }

        System.out.println();
        System.out.println("After removing Amir: ");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Is Empty: " + students.isEmpty());
    }
}