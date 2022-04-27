package module13.compositionaccount;

import java.util.ArrayList;
import java.util.List;

public class BetterAccount {
    private String firstName;
    private String lastName;
    private String username;

    private Address homeAddress;
    private Address shippingAddress;

    private List<GiftCard> associatedCards;

    public BetterAccount(){}

    public BetterAccount(String firstName, String lastName, String username, Address homeAddress, Address shippingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.homeAddress = homeAddress;
        this.shippingAddress = shippingAddress;
        this.associatedCards = new ArrayList<>();
    }

    public BetterAccount(String firstName, String lastName, String username, Address homeAddress, Address shippingAddress, List<GiftCard> associatedCards) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.homeAddress = homeAddress;
        this.shippingAddress = shippingAddress;
        this.associatedCards = associatedCards;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public Address getHomeAddress() {return homeAddress;}
    public void setHomeAddress(Address homeAddress) {this.homeAddress = homeAddress;}

    public Address getShippingAddress() {return shippingAddress;}
    public void setShippingAddress(Address shippingAddress) {this.shippingAddress = shippingAddress;}

    public List<GiftCard> getAssociatedCards() {return associatedCards;}
    public void setAssociatedCards(List<GiftCard> associatedCards) {this.associatedCards = associatedCards;}
}