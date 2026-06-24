public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Shreyash", 21);
        Student s2 = new Student("Prithvi", 25);

        s1.displayInfo();
        s2.displayInfo();
    }
}
