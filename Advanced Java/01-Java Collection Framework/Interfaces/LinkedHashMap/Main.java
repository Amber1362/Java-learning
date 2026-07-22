import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<Integer, LibraryBook> library = new LinkedHashMap<>();

        library.put(101, new LibraryBook(101, "Clean Code", "Robert Martin", true));
        library.put(102, new LibraryBook(102, "Effective Java", "Joshua Bloch", true));
        library.put(103, new LibraryBook(103, "Atomic Habits", "James Clear", false));
        library.put(104, new LibraryBook(104, "Head First Java", "Kathy Sierra", true));
        library.put(105, new LibraryBook(105, "The Pragmatic Programmer", "Andrew Hunt", false));

        System.out.println("Book with key 103:");
        System.out.println(library.get(103));

        System.out.println();

        System.out.println("Contains key 101: " + library.containsKey(101));
        System.out.println("Contains key 999: " + library.containsKey(999));

        System.out.println();

        library.remove(104);

        library.put(102, new LibraryBook(102, "Effective Java", "Joshua Bloch", false));

        System.out.println("Total Books: " + library.size());

        System.out.println();
        System.out.println("All Keys:");

        for (Integer key : library.keySet()) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("All Values:");

        for (LibraryBook book : library.values()) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Keys and Values:");

        for (Map.Entry<Integer, LibraryBook> entry : library.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}