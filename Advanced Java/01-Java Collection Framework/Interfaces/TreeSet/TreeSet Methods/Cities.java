import java.util.TreeSet;

public class Cities {
    public static void main(String[] args) {
        
        TreeSet<String> cities = new TreeSet<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Kolkata");

        System.out.println("City: ");
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println();

        System.out.println("First City: " + cities.first());

        System.out.println("Last City: " + cities.last());

        System.out.println("City above Delhi: " + cities.higher("Delhi"));

        System.out.println("City lower than Delhi: " + cities.lower("Delhi"));

        System.out.println("Ceiling of Goa: " + cities.ceiling("Goa"));

        System.out.println("Floor of Goa: " + cities.floor("Goa"));

        System.out.println("Removed the first City: " + cities.pollFirst());

        System.out.println("Removed the last City: " + cities.pollLast());

        System.out.println();
        System.out.println("Final TreeSet of Cities: ");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}