class Rectangle {

//    Data Members
    private int height;
    private int width;

//    Setter And Getter
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

//    Constructor
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

//    Methods to Calculate Area and Perimeterr
    public int area() {
        return this.height * this.width;
    }

    public int perimeter() {
        return 2*(this.height + this.width);
    }
}
public class RectangleDetials {
    public static void main(String[] args) {

//        Instance of Rectangle
        Rectangle rec = new Rectangle(3, 5);

//      Calculating Area and Perimeter
        System.out.println("Area : : "+rec.area());
        System.out.println("Perimeter : : "+rec.perimeter());
    }
}
