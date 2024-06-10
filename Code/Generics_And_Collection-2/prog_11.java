import java.util.*;
public class prog_11 
{
	public static void main(String[] args) 
	{
		int a[]= {3, 7, 2, 8, 4, 1, 10, 6, 9};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			int key=a[i];
			int freq=0;
			
			if(map.containsKey(key))
			{
				freq=map.get(key);
			}
			
			freq++;
			map.put(key,freq);
		}
		
		Arrays.sort(a);
		
		for(int i=1;i<=a.length;i++)
		{
			if(map.containsKey(i)==false)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
