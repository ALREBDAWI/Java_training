package Geometry;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        System.out.println("circle radius : " + c.radius + ", circle perimeter : " + c.perimeter() + ", surface area : " + c.surfaceArea());
    }

}
