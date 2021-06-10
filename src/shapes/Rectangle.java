package shapes;

import colorable.Colorable;

public class Rectangle extends Shape implements Colorable {
    double width;
    double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public String toString() {
        return "A Rectangle with width = " + this.width + " and length= " + this.length + ", which is a subclass of" + super.toString();
    }

    public void howToColor(){
        System.out.println("Color all four side but two parallel side are shorter than the other two");
    }
}
