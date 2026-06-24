public class Student {

    String name;
    int age;

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Amber";
        s1.age = 20;

        s2.name = "Amir";
        s2.age = 22;

        System.out.println("Name: " + s1.name + ", Age: " + s1.age);
        System.out.println("Name: " + s2.name + ", Age: " + s2.age);
    }
}