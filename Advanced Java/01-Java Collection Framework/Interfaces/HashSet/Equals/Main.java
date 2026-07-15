public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Amber", 101);
        Student s2 = new Student("Amber", 101);

        System.out.println(s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
} 