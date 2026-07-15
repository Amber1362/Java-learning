import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Book> books = new HashSet<>();

        Book b1 = new Book("Atomic Habits", "12345");
        Book b2 = new Book("Atomic Habits", "12345");
        Book b3 = new Book("Deep Work", "67890");

        books.add(b1);
        books.add(b2);
        books.add(b3);

        System.out.println("Size: " + books.size());

        for (Book book : books) {
            System.out.println(book);
        }
    }
}