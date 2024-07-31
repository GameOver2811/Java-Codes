class Circle {

//    Data Members
    private double radius;
    public static final double PI = 3.14;

//    Getter And Setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

//    Method to calculate area and circum
    public double area() {
        return PI * this.radius * this.radius;
    }
    public double circum() {
        return 2 * PI * this.radius;
    }
}

public class CircleDetails {
    public static void main(String[] args) {

//        Instance of Circle
        Circle cr = new Circle(3);

//        Method Calling for Area and Circum
        System.out.println("Area : : "+cr.area());
        System.out.println("Circumference : : "+cr.circum());
    }
}
