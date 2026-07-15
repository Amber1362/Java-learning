import java.util.Objects;

public class Book {

    String title;
    String isbn;

    Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {

        Book other = (Book) obj;

        return this.title.equals(other.title)
                && this.isbn.equals(other.isbn);
    }

    @Override
    public int hashCode() {
       return Objects.hash(title, isbn);
    }

    @Override
    public String toString() {
        return title + " - " + isbn;
    }
}