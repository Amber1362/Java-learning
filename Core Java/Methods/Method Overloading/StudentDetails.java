public class StudentDetails {
    public static void student(String name) {
        System.out.println("Name: " + name);
    }

    public static void student(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age );
    }

    public static void student(String name, int age, double cgpa) {
        System.out.println("Name: " + name + ", Age: " + age + ", CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        student("Amber");
        student("Amber", 20);
        student("Amir", 22, 8.5);
    }
}
