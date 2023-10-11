import org.junit.Test;
import static org.junit.Assert.*;

public class DVDTest {

    @Test
    public void testBorrowItem() {
        DVD dvd = new DVD("Sample DVD", "DVD001", 120);
        assertFalse(dvd.isBorrowed());
        dvd.borrowItem();
        assertTrue(dvd.isBorrowed());
    }

    @Test
    public void testReturnItem() {
        DVD dvd = new DVD("Sample DVD", "DVD001", 120);
        dvd.borrowItem();
        assertTrue(dvd.isBorrowed());
        dvd.returnItem();
        assertFalse(dvd.isBorrowed());
    }
}
