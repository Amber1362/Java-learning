import java.util.ArrayList;

public class ClearDemo {
    public static void main(String[] args) {
        ArrayList<String> students  = new ArrayList<>();

        students.add("Amber");
        students.add("Amir");
        students.add("Prithvi");
        students.add("Shreyash");
        students.add("Vishakha");

        students.clear();

        System.out.println("Size: " + students.size());
        System.out.println("Is Empty: " + students.isEmpty());
    }
}
