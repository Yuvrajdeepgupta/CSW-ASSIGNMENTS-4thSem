import java.util.*;
class Car implements Comparable<Car> 
{
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) 
    {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public void printDetails() 
    {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public int compareTo(Car other) {
        if (this.speed < other.speed) {
            return -1; 
        } else if (this.speed > other.speed) {
            return 1; 
        } else {
            return 0; 
        }
    }
}
public class prog_3 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car("Toyota", "Blue", 180);
        Car car2 = new Car("Honda", "Red", 200);

        int comparisonResult = car1.compareTo(car2);

        if (comparisonResult < 0) {
            System.out.println("Details of the car with greater speed:");
            car2.printDetails();
        } else if (comparisonResult > 0) {
            System.out.println("Details of the car with greater speed:");
            car1.printDetails();
        } else {
            System.out.println("Both cars have the same speed.");
        }
	}
}
