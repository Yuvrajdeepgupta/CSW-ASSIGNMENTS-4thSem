//PROG_4
class Laptop {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //this method is used to print object data
    @Override
    public String toString() {
        return "Laptop: Model = " + model + ", Price = $" + price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Laptop
        Laptop laptop = new Laptop();

        // Set the model using the setter method
        laptop.setModel("Dell XPS 13");

        // Print the laptop object using the toString() method
        System.out.println(laptop.toString());
    }
}
