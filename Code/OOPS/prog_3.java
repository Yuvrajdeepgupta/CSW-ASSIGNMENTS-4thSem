class Point {
    private double x;
    private double y;

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point otherPoint) {
        this.x = otherPoint.getX();
        this.y = otherPoint.getY();
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }
    
}

public class prog_3 {
    public static void main(String[] args) {
        // Create a point object using parameterized constructor
        Point point1 = new Point(3.0, 4.0);

        // Display the initial attributes
        System.out.println("Initial point coordinates (point1): (" + point1.getX() + ", " + point1.getY() + ")");

        // Create a new point object using the copy constructor
        Point point2 = new Point(point1);

        // Modify the attributes of point1
        point1.setX(5.0);
        point1.setY(6.0);

        // Display the attributes of both points
        System.out.println("Coordinates of point1 after modification: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Coordinates of point2 (unchanged due to copy constructor): (" + point2.getX() + ", " + point2.getY() + ")");
    }
}
