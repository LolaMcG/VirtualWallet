import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    ArrayList<Chargeable> cards;
    DebitCard debitCard1;
    CreditCard creditCard1;
    GiftCard giftCard;

    @Before
    public void before(){
        cards = new ArrayList<>();
        wallet = new Wallet();
        debitCard1 = new DebitCard(12345, 1025, 111, 123, 121212, 1000);
        creditCard1 = new CreditCard(67890, 1025, 222, 1000);
        giftCard = new GiftCard(50);
//        cards.add(creditCard1);
//        cards.add(giftCard);
    }

    @Test
    public void canAddCard(){
        wallet.addCard(creditCard1);
        assertEquals(1, wallet.getCards());
    }

    @Test
    public void canSetCard(){
        wallet.setCards(debitCard1);
        assertEquals(debitCard1, wallet.getSelectedPaymentCard());
    }

}
