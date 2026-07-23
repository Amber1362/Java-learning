import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student("Amber", 101);
        Student s2 = new Student("Amber", 101);
        Student s3 = new Student("Rahul", 102);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("Hash Codes:");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println();

        System.out.println("Equals:");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println();

        System.out.println("Students in HashSet:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println("Size: " + students.size());
    }
}