public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
        if (this.width < 0) {
            this.width = 0;
        }
        if (this.length < 0) {
            this.length = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (width*length);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
    }
}