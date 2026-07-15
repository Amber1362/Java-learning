import java.util.LinkedHashSet;

public class MovieCollection {
    public static void main(String[] args) {
        LinkedHashSet<String> movies = new LinkedHashSet<>();

        movies.add("Inception");
        movies.add("InterStellar");
        movies.add("The Dark Knight");
        movies.add("Inception");
        movies.add("Openheimer");
        movies.add("InterStellar");
        movies.add("The Prestige");

        System.out.println("Movies: ");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println();
        System.out.println("Total movies: " + movies.size());

        System.out.println();

        if(movies.contains("Openheimer")) {
            System.out.println("Movie Found!");
        } else {
            System.out.println("Movie Not Found!");
        }
    }
}
