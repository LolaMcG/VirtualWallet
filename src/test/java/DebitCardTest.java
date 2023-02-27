import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard1;

    @Before
    public void before(){
        debitCard1 = new DebitCard(12345, 1025, 111, 123, 121212, 1000);
    }

    @Test
    public void canCharge(){
        assertEquals(500, debitCard1.charge(500), 0.0);
    }

    @Test
    public void canLogTransaction(){
        assertEquals("You have spent £10.0", debitCard1.logTransaction(10));
    }
}
