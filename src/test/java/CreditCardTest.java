import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(67890, 1025, 222, 1000);
    }

    @Test
    public void canCharge(){
        assertEquals(900, creditCard.charge(100), 0.0);
    }

    @Test
    public void canAddTransactionPercentage(){
        assertEquals(899, creditCard.addTransactionPercentage(100), 0.0);
    }

    @Test
    public void canLogTransaction(){
        assertEquals("You have spent £10.0", creditCard.logTransaction(10));
    }
}
