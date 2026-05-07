package Day8.Assigment;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;

 class Book {
    private final String isbn;
    private final String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }


    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public String toString() {
        return title + " (ISBN: " + isbn + ")";
    }
}
public class Que3 {
    public static void main(String[] args) {
        Map<Book, Boolean> inventory = new HashMap<>();

        Book book1 = new Book("978-0134685991", "Effective Java");
        Book book2 = new Book("978-0132350884", "Clean Code");

        inventory.put(book1, true);
        inventory.put(book2, true);

        checkOut(inventory, book1);

        System.out.println("Is 'Effective Java' available? " + inventory.get(book1));
    }

    public static void checkOut(Map<Book, Boolean> map, Book book) {
        if (map.getOrDefault(book, false)) {
            map.put(book, false);
            System.out.println("Checked out: " + book);
        } else {
            System.out.println("Sorry, " + book + " is already out.");
        }
    }
}
