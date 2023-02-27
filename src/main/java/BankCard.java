public abstract class BankCard {

    private int cardNo;
    private int expiryDate;
    private int securityNo;

    public BankCard(int cardNo, int expiryDate, int securityNo){
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
        this.securityNo = securityNo;
    }
}
