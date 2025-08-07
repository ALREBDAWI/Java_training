package Geometry;

public class Circle {
    Point center;
    Double radius;

    public Circle(Point pCenter,Double pRadius) {  //constructor
        this.radius = pRadius;
        this.center = pCenter;
    }

    public Circle(Double pRadius) {  //second constructor
        this.radius = pRadius;
    }

    public Double perimeter() {
        return radius * Math.PI * 2;
    }

    public Double surfaceArea() {
        return (radius * radius) * Math.PI ;
    }

}
