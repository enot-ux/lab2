import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testBorrowItem() {
        Item item = new Item("Sample Item", "Item001");
        assertFalse(item.isBorrowed());
        item.borrowItem();
        assertTrue(item.isBorrowed());
    }

    @Test
    public void testReturnItem() {
        Item item = new Item("Sample Item", "Item001");
        item.borrowItem();
        assertTrue(item.isBorrowed());
        item.returnItem();
        assertFalse(item.isBorrowed());
    }
}
