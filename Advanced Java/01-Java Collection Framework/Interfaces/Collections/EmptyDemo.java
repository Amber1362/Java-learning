import java.util.ArrayList;

public class EmptyDemo {
    public static void main(String[] args) {
        ArrayList<String> weeks = new ArrayList<>();

        System.out.println("Is the collection empty? " + weeks.isEmpty());

        weeks.add("Sunday");

        System.out.println("After adding an element:");
        System.out.println("Is the collection empty? " + weeks.isEmpty());
    }
}
