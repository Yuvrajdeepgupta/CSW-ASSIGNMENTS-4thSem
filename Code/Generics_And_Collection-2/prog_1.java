import java.util.*;
class Pair<K,V>
{
	private K key;
	private V value;
	
	public Pair(K key,V value) 
	{
		this.key=key;
		this.value=value;
	}
	
	public K getKey() 
	{
		return key;
	}
	
	public V getValue() 
	{
		return value;
	}
	
	public void setKey(K key) 
	{
		this.key = key;
	}
	
	public void setValue(V value) 
	{
		this.value = value;
	}
	
	@Override
	public String toString() 
	{
		return "Key:"+key+"| Value:"+value;
	}
}
public class prog_1 
{
	public static void main(String[] args) 
	{
		Pair<Integer,Integer> pair1=new Pair<>(1,100);
		Pair<Integer,Integer> pair2=new Pair<>(2,200);
		Pair<Integer,Integer> pair3=new Pair<>(3,300);
		
		System.out.println(pair1.toString());
		System.out.println(pair2.toString());
		System.out.println(pair3.toString());
	}
}
