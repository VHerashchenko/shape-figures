package com.vh;

import com.vh.figures.Point;
import com.vh.figures.Rectangle;
import com.vh.shape.Shape;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        Shape shape = new Rectangle(new Point(3,4),new Point(7,6));
        System.out.println(shape);
    }
}