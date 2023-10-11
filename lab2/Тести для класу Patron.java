import org.junit.Test;
import static org.junit.Assert.*;

public class PatronTest {

    @Test
    public void testBorrowItem() {
        Patron patron = new Patron("Alice", "Patron001");
        Item item = new Item("Sample Item", "Item001");
        patron.borrow(item);
        assertTrue(patron.getBorrowedItems().contains(item));
    }

    @Test
    public void testReturnItem() {
        Patron patron = new Patron("Alice", "Patron001");
        Item item = new Item("Sample Item", "Item001");
        patron.borrow(item);
        assertTrue(patron.getBorrowedItems().contains(item));
        patron.returnItem(item);
        assertFalse(patron.getBorrowedItems().contains(item));
    }
}
