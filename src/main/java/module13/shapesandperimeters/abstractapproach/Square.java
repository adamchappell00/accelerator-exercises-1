package module13.shapesandperimeters.abstractapproach;

public class Square extends Shape{

    int side;

    public Square(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return 0;
    }

    @Override
    public int perimeter() {
        return 0;
    }
}
