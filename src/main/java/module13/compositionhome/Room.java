package module13.compositionhome;

import java.util.List;

public class Room {

    String type;
    double lengthInFeet;
    double widthInFeet;
    double areaSquareFeet;
    double ceilingHeightInFeet;
    String flooring;
    List<String> appliances;
    List<String> features;

    public Room(){}

    public Room(String type, double lengthInFeet, double widthInFeet, double areaSquareFeet, double ceilingHeightInFeet, String flooring, List<String> appliances, List<String> features) {
        this.type = type;
        this.lengthInFeet = lengthInFeet;
        this.widthInFeet = widthInFeet;
        this.areaSquareFeet = areaSquareFeet;
        this.ceilingHeightInFeet = ceilingHeightInFeet;
        this.flooring = flooring;
        this.appliances = appliances;
        this.features = features;
    }

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public double getLengthInFeet() {return lengthInFeet;}
    public void setLengthInFeet(double lengthInFeet) {this.lengthInFeet = lengthInFeet;}

    public double getWidthInFeet() {return widthInFeet;}
    public void setWidthInFeet(double widthInFeet) {this.widthInFeet = widthInFeet;}

    public double getAreaSquareFeet() {return areaSquareFeet;}
    public void setAreaSquareFeet(double areaSquareFeet) {this.areaSquareFeet = areaSquareFeet;}

    public double getCeilingHeightInFeet() {return ceilingHeightInFeet;}
    public void setCeilingHeightInFeet(double ceilingHeightInFeet) {this.ceilingHeightInFeet = ceilingHeightInFeet;}

    public String getFlooring() {return flooring;}
    public void setFlooring(String flooring) {this.flooring = flooring;}

    public List<String> getAppliances() {return appliances;}
    public void setAppliances(List<String> applicances) {this.appliances = applicances;}

    public List<String> getFeatures() {return features;}
    public void setFeatures(List<String> features) {this.features = features;}

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", lengthInFeet=" + lengthInFeet +
                ", widthInFeet=" + widthInFeet +
                ", areaSquareFeet=" + areaSquareFeet +
                ", ceilingHeightInFeet=" + ceilingHeightInFeet +
                ", flooring='" + flooring + '\'' +
                ", appliances=" + appliances +
                ", features=" + features +
                '}';
    }
}
