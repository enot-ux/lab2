import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBorrowItem() {
        Book book = new Book("Sample Book", "Book001", "John Doe");
        assertFalse(book.isBorrowed());
        book.borrowItem();
        assertTrue(book.isBorrowed());
    }

    @Test
    public void testReturnItem() {
        Book book = new Book("Sample Book", "Book001", "John Doe");
        book.borrowItem();
        assertTrue(book.isBorrowed());
        book.returnItem();
        assertFalse(book.isBorrowed());
    }
}
