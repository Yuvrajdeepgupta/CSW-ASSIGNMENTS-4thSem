import java.util.*;
public class prog_8 
{
	public static void main(String[] args) 
	{
		String s1="two";
		String s2="owt";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagrams!");
			System.exit(0);
		}
		
		Map<Character,Integer> map1=new HashMap<>();
		Map<Character,Integer> map2=new HashMap<>();
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			char key1=a[i];
			char key2=b[i];
			
			int freq1=0;
			int freq2=0;
			
			if(map1.containsKey(key1))
			{
				freq1=map1.get(key1);
			}
			
			if(map2.containsKey(key2))
			{
				freq2=map2.get(key2);
			}
			
			freq1++;
			freq2++;
			
			map1.put(key1,freq1);
			map2.put(key2,freq2);
		}
		
		
		if(map1.equals(map2))
		{
			System.out.println("Anagrams!");
		}
	}
}
