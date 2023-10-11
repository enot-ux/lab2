import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testRegisterPatron() {
        Library library = new Library();
        Patron patron = new Patron("Alice", "Patron001");
        library.registerPatron(patron);
        assertTrue(library.getPatrons().contains(patron));
    }

    @Test
    public void testLendItem() {
        Library library = new Library();
        Patron patron = new Patron("Alice", "Patron001");
        Item item = new Item("Sample Item", "Item001");
        library.lendItem(patron, item);
        assertTrue(library.listBorrowedItems().contains(item));
    }

    @Test
    public void testReturnItem() {
        Library library = new Library();
        Patron patron = new Patron("Alice", "Patron001");
        Item item = new Item("Sample Item", "Item001");
        library.lendItem(patron, item);
        assertTrue(library.listBorrowedItems().contains(item));
        library.returnItem(patron, item);
        assertFalse(library.listBorrowedItems().contains(item));
    }
}
