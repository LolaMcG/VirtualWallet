import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(50);
    }


    @Test
    public void canCharge(){
        assertEquals(40, giftCard.charge(10), 0.0);
    }
}
