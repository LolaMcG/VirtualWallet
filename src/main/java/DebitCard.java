public class DebitCard extends BankCard implements Chargeable{

    private int accountNo;
    private int sortCode;
    private double balance;

    public DebitCard(int cardNo, int expiryDate, int securityNo, int accountNo, int sortCode, double balance){
        super(cardNo, expiryDate, securityNo);
        this.accountNo = accountNo;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public double charge(int amount){
        return this.balance -= amount;
    }

    public String logTransaction(double amount) {
        return "You have spent £" + amount;
    }
}
