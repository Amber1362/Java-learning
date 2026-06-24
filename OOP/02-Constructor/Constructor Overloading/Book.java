public class Book {
    String title;
    int pages;

    Book() {
        System.out.println("No book details provided.");
    }

    Book(String title) {
        this.title = title;
        System.out.println("Title: " + title);
    }

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        System.out.println("Title: " + title + ", Pages: " + pages);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Atomic Habits");
        Book b3 = new Book("Atomic Habits", 320);
    }

}
