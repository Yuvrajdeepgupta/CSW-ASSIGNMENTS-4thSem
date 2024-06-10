import java.util.*;
public class prog_9 
{
	public static void main(String[] args) 
	{
		int a[]= {4, 2, 4, 5, 2, 3, 1, 1, 5};
		
		HashSet<Integer> set1=new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			
			if(set1.contains(num))
			{
				System.out.println(a[i]);
			}
			else
			{
				set1.add(a[i]);
			}
		}
	}
}
