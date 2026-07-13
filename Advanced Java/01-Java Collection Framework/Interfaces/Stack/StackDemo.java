import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("Python");
        books.push("C++");
        books.push("JavaScript");

        for (String book : books) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Top element: " + books.peek());

        System.out.println();
        System.out.println("Removed top element: " + books.pop());

        System.out.println();
        System.out.println("Updated stack of books: ");
        for (String book : books) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Size: " + books.size());

        System.out.println();
        System.out.println("Is Empty: " + books.isEmpty());
    }
}