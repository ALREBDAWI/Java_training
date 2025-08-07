package Rectangle;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double pLength,double pWidth){ //constructor with 2 params
        length = pLength;
        width = pWidth;
    }

    public double surface(){
        return length*width;
    }

    public double perimeter(){
        return 2*(length+width);
    }

    public void display(){
        System.out.println("length of rectangle : " + length + ", width of rectangle : " + width
                + ", Surface Area: "+ surface() + ", perimeter : " + perimeter());
    }

}
