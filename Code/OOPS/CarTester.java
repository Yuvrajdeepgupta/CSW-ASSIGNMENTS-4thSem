class Car 
{
    private String make;
    private String model;

    public Car(String make, String model) 
    {
        this.make = make;
        this.model = model;
    }

    public String getMake() 
    {
        return make;
    }

    public void setMake(String make) 
    {
        this.make = make;
    }

    public String getModel() 
    {
        return model;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }
}

public class CarTester 
{
    public static void main(String[] args) 
    {
        Car myCar1 = new Car("Toyota", "Camry");
        Car myCar2 = new Car(null, null);

        System.out.println("Initial make and model of myCar1: " + myCar1.getMake() + " " + myCar1.getModel());
        System.out.println("Initial make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());

       
        myCar2.setMake("Honda");
        myCar2.setModel("Accord");

       System.out.println("Updated make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());
    }
}
