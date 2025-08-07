package Geometry;
//to test if a certain point is included in a certain circle
public class TestPointInclusion {
    public static void main(String[] args) {
        Point p1 = new Point(1.0,2.0);
        Point p2 = new Point(2.0,6.0);
        Circle c = new Circle(p1,5.0);

        // this is the Euclidean way of calculating distance between two points
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        double distance = Math.sqrt(dx*dx + dy*dy);

        if(distance <= c.radius) {
            System.out.println("Inside Circle");
        }else  {
            System.out.println("Outside Circle");
        }
    }
}
