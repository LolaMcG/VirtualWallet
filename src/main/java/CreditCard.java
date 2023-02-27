public class CreditCard extends BankCard implements Chargeable {

    private double availCredit;

    public CreditCard(int cardNo, int expiryDate, int securityNo, double availCredit){
        super(cardNo, expiryDate, securityNo);
        this.availCredit = availCredit;
    }

    public double charge(int amount){
        double percentageAmount = 0.01;
        double fee = percentageAmount * amount;
        double total = fee + amount;
        return this.availCredit -= total;
    }

//    public double addTransactionPercentage(double amount) {
//        double percentageAmount = 0.01;
//        double fee = percentageAmount * amount;
//        double total = fee + amount;
//        return this.availCredit -= total;
//    }

    public String logTransaction(double amount){
//        System.out.println("You have spent £" + amount);
        return "You have spent £" + amount;

    }
}
