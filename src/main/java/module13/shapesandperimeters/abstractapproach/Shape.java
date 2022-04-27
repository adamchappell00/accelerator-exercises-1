package module13.shapesandperimeters.abstractapproach;

public abstract class Shape {
    String name;
    String color;
    int xCoordinate;
    int yCoordinate;

    public abstract int area();
    public abstract int perimeter();

}