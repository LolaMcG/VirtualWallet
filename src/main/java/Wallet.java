import java.util.ArrayList;

public class Wallet {

    private ArrayList<Chargeable> cards;
    private Chargeable selectedPaymentCard;

    public Wallet(){
        this.cards = new ArrayList<>();

    }

    public void addCard(Chargeable card){
        this.cards.add(card);
    }

    public int getCards(){
        return this.cards.size();
    }

    public void setCards(Chargeable newPaymentCard){
        this.selectedPaymentCard = newPaymentCard;
    }

    public Chargeable getSelectedPaymentCard(){
        return this.selectedPaymentCard;
    }
}
