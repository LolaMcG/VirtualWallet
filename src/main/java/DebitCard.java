import java.util.ArrayList;

public class DebitCard extends BankCard implements Chargeable{

    private int accountNo;
    private int sortCode;
    private double balance;
    private ArrayList<Double> transactions;

    public DebitCard(int cardNo, int expiryDate, int securityNo, int accountNo, int sortCode, double balance){
        super(cardNo, expiryDate, securityNo);
        this.accountNo = accountNo;
        this.sortCode = sortCode;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public double charge(double amount){
        transactions.add(amount);
        return this.balance -= amount;
    }

//    public String logTransaction(double amount) {
//        return "You have spent £" + amount;
//    }

    public ArrayList logTransaction(){
        return this.transactions;
    }
}
