import java.util.*;
class Animal 
{
    private String name;
    private String color;
    private String type; 

    public Animal(String name, String color, String type) 
    {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(name, color, type);
    }
}

public class prog_6 
{
    public static void main(String[] args) 
    {
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal cat = new Animal("Cat", "White", "Pet");
        Animal tiger = new Animal("Tiger", "Orange", "Wild");

        System.out.println("Hash code of Dog: " + dog.hashCode());
        System.out.println("Hash code of Cat: " + cat.hashCode());
        System.out.println("Hash code of Tiger: " + tiger.hashCode());
    }
}
