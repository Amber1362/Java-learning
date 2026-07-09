import java.util.ArrayList;

public class ContainsDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Kolkata");

        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println();
        System.out.println("Does Delhi exist? " + cities.contains("Delhi"));
        System.out.println("Does Jaipur exist? " + cities.contains("Jaipur"));
    }
}
