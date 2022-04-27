package module13.compositionaccount;

public class GiftCard {

    private String cardNumber;
    public float balance;

    public GiftCard(){}
    public GiftCard(String cardNumber, float balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {return cardNumber;}
    public void setCardNumber(String cardNumber) {this.cardNumber = cardNumber;}

    public float getBalance() {return balance;}
    public void setBalance(float balance) {this.balance = balance;}
}
