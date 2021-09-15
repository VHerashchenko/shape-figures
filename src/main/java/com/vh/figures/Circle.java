package com.vh.figures;

import com.vh.shape.Shape;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape {
    private Point centerCircle;
    private double radius;

    public Circle(Point centerCircle, double radius) {
        checkRadius(radius);
        this.centerCircle = centerCircle;
    }

    public Circle(double x, double y, double radius) {
        checkRadius(radius);
        this.centerCircle = new Point(x, y);
    }

    private void checkRadius(double radius) throws IllegalArgumentException {
        if( radius <= 0 ){
            throw new IllegalArgumentException("radius must be greater then 0");
        }
        this.radius = radius;
    }

    @Override
    public void move(double dx, double dy) {
        centerCircle.setX( centerCircle.getX() + dx);
        centerCircle.setY( centerCircle.getY() + dy);
    }

    @Override
    public double square() {
        return 3.14*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerCircle=" + centerCircle +
                ", radius=" + radius +
                '}';
    }
}