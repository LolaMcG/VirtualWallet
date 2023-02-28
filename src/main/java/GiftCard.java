public class GiftCard implements Chargeable {

    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public double charge(double amount){
        return this.balance -= amount;
    }
}
