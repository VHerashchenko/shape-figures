package com.vh.figures;

import com.vh.shape.Shape;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends Shape {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint){
        if(checkTriangle(firstPoint, secondPoint, thirdPoint)){
            this.firstPoint = firstPoint;
            this.secondPoint = secondPoint;
            this.thirdPoint = thirdPoint;
        }
    }

    private boolean checkTriangle(Point firstPoint, Point secondPoint,
                               Point thirdPoint) throws IllegalArgumentException {

        if(firstPoint.getX() == secondPoint.getX() && firstPoint.getX() == thirdPoint.getX()){
            throw new IllegalArgumentException();
        }
        else if(firstPoint.getY() == secondPoint.getY() && firstPoint.getY() == thirdPoint.getY()) {
            throw new IllegalArgumentException();
        }
        else {
            return true;
        }
    }

    private double takeDistance(Point first, Point second){
        return Math.sqrt(
                Math.pow(second.getX() - first.getX(), 2)
                        + Math.pow(second.getY() - first.getY(), 2));
    }

    @Override
    public double square() {
        double sideA = takeDistance(firstPoint, secondPoint);
        double sideB = takeDistance(firstPoint, thirdPoint);
        double sideC = takeDistance(secondPoint, thirdPoint);

        double semiPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA)
                * (semiPerimeter - sideB) * (semiPerimeter - sideC));

    }

    @Override
    public double perimeter() {
        return takeDistance(firstPoint, secondPoint)
        + takeDistance(firstPoint, thirdPoint)
        + takeDistance(secondPoint, thirdPoint);
    }

    @Override
    public void move(double dx, double dy) {
        double differenceX = dx - firstPoint.getX();
        double differenceY = dy - firstPoint.getY();
        firstPoint.setX(dx);
        firstPoint.setY(dy);
        secondPoint.setX(secondPoint.getX() + differenceX);
        secondPoint.setY(secondPoint.getY() + differenceY);
        thirdPoint.setX(thirdPoint.getX() + differenceX);
        thirdPoint.setY(thirdPoint.getY() + differenceY);
    }

    @Override
    public String toString(){
        return "Triangle {First point = " + firstPoint
                + " Second point = " + secondPoint
                + " Third point = " + thirdPoint + "}"
                + super.toString();
    }
}


