import java.util.ArrayList;

public class SetDemo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Go");

        System.out.println("Before replacing third element: ");
        for (String lang : languages) {
            System.out.println(lang);
        }

        System.out.println();

        languages.set(2, "C#");

        System.out.println("After replacing third element: ");
        for (String lang : languages) {
            System.out.println(lang);
        }

        System.out.println();
        System.out.println("Size before: " + languages.size());
        System.out.println("Size after: " + languages.size());
    }
}
