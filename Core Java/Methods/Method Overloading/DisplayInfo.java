public class DisplayInfo {
    public static void display(int age) {
        System.out.println("Age: " + age);
    }

    public static void display(String name) {
        System.out.println("Name: " + name);
    }

    public static void display(double cgpa) {
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        display(20);
        display("Amber");
        display(8.9);
    }
}
