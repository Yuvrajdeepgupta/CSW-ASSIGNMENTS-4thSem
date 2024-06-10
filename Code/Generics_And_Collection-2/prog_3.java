import java.util.*;
class car implements Comparable<car>
{
	private int modelno;
	private String name;
	private int stock;
	
	public car(int modelno,String name,int stock) 
	{
		this.modelno=modelno;
		this.name=name;
		this.stock=stock;
	}
	
	public int getStock() {
		return stock;
	}
	
	public int getModelno() {
		return modelno;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(car othercar)
	{
		if(this.stock<othercar.stock) {return -1;}
		else if(this.stock>othercar.stock) {return 1;}
		else
		{
			return 0;
		}
	}
	
	@Override
	public String toString() 
	{
		return modelno + " " + name + " " + stock;
	}
}

class carapp
{
	private List<car> carlist;
	
	public carapp() 
	{
		carlist=new ArrayList<>();
	}
	
     void Buycar(car newcar)
	{
		carlist.add(newcar);
	}
     
	void prinCarsDetails()
	{
		Iterator<car> i1=carlist.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
	
	void sortcars()
	{
		Collections.sort(carlist);
	}
}

public class prog_3 
{
	public static void main(String[] args) 
	{
		car car1=new car(2013 ,"creta" ,10);
		car car2=new car(2020 ,"MG", 13);
		car car3=new car(2018 ,"Kia", 20);
		car car4=new car(2017 ,"Audi" ,45);
		car car5=new car(2015 ,"BMW", 55);
		
		carapp Carlist=new carapp();
		
		Carlist.Buycar(car1);
		Carlist.Buycar(car2);
		Carlist.Buycar(car3);
		Carlist.Buycar(car4);
		Carlist.Buycar(car5);
		
		System.out.println("Updated Car List:");
		Carlist.prinCarsDetails();
	}
}
