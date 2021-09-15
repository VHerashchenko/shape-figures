package com.vh.figures;

import com.vh.shape.Shape;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Rectangle extends Shape {
    private Point leftTop;
    private Point rightBottom;

    public Rectangle(double left, double top, double right
            , double bottom){
        this.leftTop = new Point(left,top);
        this.rightBottom = new Point( right , bottom );
    }

    @Override
    public void move(double dx, double dy) {
        leftTop.setX( leftTop.getX() + dx);
        leftTop.setY( leftTop.getY() + dy);
        rightBottom.setX( rightBottom.getX() + dx);
        rightBottom.setY( rightBottom.getY() + dy);
    }

    @Override
    public double perimeter() {
        return 2.*(Math.abs(rightBottom.getX() - leftTop.getX()) +
                Math.abs(rightBottom.getY() - leftTop.getY()));
    }

    @Override
    public double square() {
        return Math.abs((rightBottom.getX() - leftTop.getX())*
                (rightBottom.getY() - leftTop.getY()));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftTop=" + leftTop +
                ", rightBottom=" + rightBottom +
                super.toString() +
                '}';
    }
}