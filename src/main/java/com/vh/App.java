package com.vh;

import com.vh.figures.Circle;
import com.vh.figures.Point;
import com.vh.figures.Rectangle;
import com.vh.figures.Triangle;
import com.vh.shape.Shape;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        Shape shape = new Rectangle(new Point(3,4),new Point(7,6));
        System.out.println(shape);

        Circle circle = new Circle(new Point(3,4), 10);
        System.out.println(circle);

        Triangle triangle = new Triangle(new Point(1,2), new Point(3,5), new Point(5,1));
        System.out.println(triangle);
    }
}