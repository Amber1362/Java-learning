import java.util.ArrayList;

public class SizeDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Lambo");
        cars.add("Ferari");
        cars.add("Porche");
        cars.add("Mercedes");

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("Size: " + cars.size());

        cars.remove("Porche");

        System.out.println("Size: " + cars.size());
    }
}
