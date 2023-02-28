import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(67890, 1025, 222, 1000);
    }


    @Test
    public void canCharge(){
        assertEquals(899, creditCard.charge(100), 0.0);
    }

//    @Test
//    public void canLogTransaction(){
//        assertEquals("You have spent £10.0", creditCard.logTransaction(10));
//    }

    @Test
    public void canLogTransaction(){
        creditCard.charge(100);
        creditCard.charge(10.99);
        ArrayList<Double> expectedTransactions = new ArrayList<Double>(Arrays.asList(100.0, 10.99));
        assertEquals(expectedTransactions, creditCard.logTransaction());
    }
}
