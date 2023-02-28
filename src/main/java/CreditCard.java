import java.util.ArrayList;

public class CreditCard extends BankCard implements Chargeable {

    private double availCredit;
    private ArrayList<Double> transactions;

    public CreditCard(int cardNo, int expiryDate, int securityNo, double availCredit){
        super(cardNo, expiryDate, securityNo);
        this.availCredit = availCredit;
        this.transactions = new ArrayList<>();
    }

    public double charge(double amount){
        double percentageAmount = 0.01;
        double fee = percentageAmount * amount;
        double total = fee + amount;
        transactions.add(amount);
        return this.availCredit -= total;
    }

//    public double addTransactionPercentage(double amount) {
//        double percentageAmount = 0.01;
//        double fee = percentageAmount * amount;
//        double total = fee + amount;
//        return this.availCredit -= total;
//    }

//    public String logTransaction(double amount){
////        System.out.println("You have spent £" + amount);
//        return "You have spent £" + amount;
//    }


    public ArrayList logTransaction(){
        return this.transactions;
    }
}
