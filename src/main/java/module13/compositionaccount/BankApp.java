package module13.compositionaccount;

import java.util.List;

public class BankApp {

    public static void main(String[] args) {

        Address myAddress = new Address("123 Main", "San Antonio", "Texas", "78232");
        BetterAccount myAccount = new BetterAccount("Adam", "Chappell", "adamsacct123", myAddress, myAddress);
        GiftCard newCard = new GiftCard("1234567",100);
        List<GiftCard> myCards = myAccount.getAssociatedCards();
        myCards.add(newCard);
        myAccount.setAssociatedCards(myCards);

    }
}
