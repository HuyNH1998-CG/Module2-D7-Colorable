package shapes;

import colorable.Colorable;

public class Square extends Shape implements Colorable {
    double side;

    public Square() {
        side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public String toString() {
        return "A Square with sides= " + this.side + ", which is a sub class of" + super.toString();
    }
    public void howToColor(){
        System.out.println("Color all four side");
    }
}
