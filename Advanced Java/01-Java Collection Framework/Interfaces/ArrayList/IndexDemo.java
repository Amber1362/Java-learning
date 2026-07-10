import java.util.ArrayList;

public class IndexDemo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("The Original List: ");

        for (String lang : languages) {
            System.out.println(lang);
        }
        System.out.println();

        System.out.println("Language at index 2: " + languages.get(2));
        System.out.println();

        languages.set(2, "C#");

        System.out.println("Replaced C++ with C#: ");
        for (String lang : languages) {
            System.out.println(lang);
        }
        System.out.println();

        languages.add(1, "Go");

        System.out.println("languages after adding Go at index 1: ");
        for (String lang : languages) {
            System.out.println(lang);
        }
        System.out.println();

        languages.remove(3);

        System.out.println("languages after removing index 3 element: ");
        for (String lang : languages) {
            System.out.println(lang);
        }

        System.out.println();
        System.out.println("Final List: ");
        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}
