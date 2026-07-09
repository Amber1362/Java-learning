import java.util.ArrayList;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println("Array after removing Grapes: ");

        fruits.remove("Grapes");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
