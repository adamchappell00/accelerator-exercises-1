package module13.compositionhome;

import java.util.List;

public class Home {

    String owner;
    double totalSqFeet;
    String sidingType;
    String roofType;
    int listingprice;
    String schoolDistrict;
    List<Room> rooms;

    public Home(){}

    public Home(String owner, double totalSqFeet, String sidingType, String roofType, int listingprice, String schoolDistrict, List<Room> rooms) {
        this.owner = owner;
        this.totalSqFeet = totalSqFeet;
        this.sidingType = sidingType;
        this.roofType = roofType;
        this.listingprice = listingprice;
        this.schoolDistrict = schoolDistrict;
        this.rooms = rooms;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getTotalSqFeet() {
        return totalSqFeet;
    }

    public void setTotalSqFeet(double totalSqFeet) {
        this.totalSqFeet = totalSqFeet;
    }

    public String getSidingType() {
        return sidingType;
    }

    public void setSidingType(String sidingType) {
        this.sidingType = sidingType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public int getListingprice() {
        return listingprice;
    }

    public void setListingprice(int listingprice) {
        this.listingprice = listingprice;
    }

    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Home{" +
                "owner='" + owner + '\'' +
                ", totalSqFeet=" + totalSqFeet +
                ", sidingType='" + sidingType + '\'' +
                ", roofType='" + roofType + '\'' +
                ", listingprice=" + listingprice +
                ", schoolDistrict='" + schoolDistrict + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
