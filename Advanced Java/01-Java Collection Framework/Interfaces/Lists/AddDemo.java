import java.util.ArrayList;

public class AddDemo {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();

        states.add("Maharashtra");
        states.add("Uttar Pradesh");
        states.add("Rajasthan");
        states.add("Kashmir");

        System.out.println("Before: ");
        for (String state : states) {
            System.out.println(state);
        }

        System.out.println("Size before: " + states.size());

        System.out.println();

        states.add(2, "Gujarat");
        System.out.println("After inserting Gujarat at index 2: ");

        for (String state : states) {
            System.out.println(state);
        }

        System.out.println();
        System.out.println("Size after: " + states.size());
    }
}
