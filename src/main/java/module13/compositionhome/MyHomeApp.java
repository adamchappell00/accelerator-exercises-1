package module13.compositionhome;

import java.util.ArrayList;
import java.util.List;

public class MyHomeApp {
    public static void main(String[] args) {

        List<Room> myRooms = new ArrayList<>();

        // My Living Room
        List<String> livingAppliances = new ArrayList<>();
        List<String> livingFeatures = new ArrayList<>();
        livingFeatures.add("Chandelier");
        livingFeatures.add("Ceiling Fan");
        livingFeatures.add("French Doors");
        Room livingRoom = new Room("Living", 12, 12, 144, 12,"Hardwood", livingAppliances, livingFeatures);
        myRooms.add(livingRoom);

        // My Kitchen
        List<String> kitchenAppliances = new ArrayList<>();
        List<String> kitchenFeatures = new ArrayList<>();
        kitchenAppliances.add("Refrigerator");
        kitchenAppliances.add("Stove");
        kitchenAppliances.add("Dishwasher");
        kitchenFeatures.add("Bar");
        kitchenFeatures.add("Large Pantry Unit");
        Room myKitchen = new Room("Kitchen", 18,10, 180, 10, "Tile", kitchenAppliances, kitchenFeatures);
        myRooms.add(myKitchen);

        // My Study
        List<String> studyAppliances = new ArrayList<>();
        List<String> studyFeatures = new ArrayList<>();
        studyAppliances.add("Mini Fridge");
        studyFeatures.add("Library Shelving");
        studyFeatures.add("Bay Windows");
        Room myStudy = new Room("Study", 18,36, (18*36), 16, "Hardwood", studyAppliances, studyFeatures);
        myRooms.add(myStudy);

        // My Bedroom
        List<String> bedroomAppliances = new ArrayList<>();
        List<String> bedroomFeatures = new ArrayList<>();
        bedroomFeatures.add("Fan");
        Room myBedroom = new Room("Master Bedroom", 14,14,(14*14), 12, "Carpet", bedroomAppliances, bedroomFeatures);
        myRooms.add(myBedroom);

        Home adamsHome = new Home("Adam", 8000, "Masonry", "Masonry", 500000, "None", myRooms);
        System.out.println(adamsHome);

    }
}