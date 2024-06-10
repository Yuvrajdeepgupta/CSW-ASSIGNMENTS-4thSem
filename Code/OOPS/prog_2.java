class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class prog_2 {
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        // Display the initial attributes
        System.out.println("Initial length: " + myRectangle.getLength());
        System.out.println("Initial width: " + myRectangle.getWidth());

        // Set new values for attributes
        myRectangle.setLength(7.0);
        myRectangle.setWidth(4.0);

        // Display the updated attributes
        System.out.println("Updated length: " + myRectangle.getLength());
        System.out.println("Updated width: " + myRectangle.getWidth());

        // Calculate and display area and perimeter
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
    }
}
