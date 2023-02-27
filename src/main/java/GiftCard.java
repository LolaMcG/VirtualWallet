public class GiftCard implements Chargeable {

    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public double charge(int amount){
        return this.balance -= amount;
    }
}
