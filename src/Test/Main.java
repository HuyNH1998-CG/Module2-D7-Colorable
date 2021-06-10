package Test;

import colorable.Colorable;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(10);
        shapes[2] = new Rectangle(10, 5);
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            if(shape instanceof Colorable color){
                color.howToColor();
            }
        }
    }
}
