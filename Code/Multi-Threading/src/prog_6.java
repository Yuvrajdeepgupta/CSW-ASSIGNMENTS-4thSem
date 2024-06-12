import java.util.*;
class generateprime implements Runnable
{
	static List<Integer> listofprimes=Collections.synchronizedList(new ArrayList<>());
	private int start;
	private int end;
	
	public generateprime(int start,int end) 
	{
		this.start=start;
		this.end=end;
	}
	
	@Override
	public void run() 
	{
		for(int i=start;i<=end;i++)
		{
			if(isprime(i))
			{
				listofprimes.add(i);
			}
		}
	}
	
	boolean isprime(int n)
	{
			if (n <= 1) {return false;}
	        if (n == 2) {return true;}
	        if (n % 2 == 0) {return false;}
	        for (int i=3;i<=n/2;i+=2) 
	        {
	            if (n % i == 0) {return false;}
	        }
	        return true;
	}
}


public class prog_6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int limit=100; //Set-Limit
		int numthreads=4; //Number of Threads
		
		int range=limit/numthreads; //Range
		
		Thread[] threads=new Thread[numthreads];
		
		int start=1,end=range;
		for(int i=0;i<numthreads;i++)
		{
			threads[i]=new Thread(new generateprime(start,end));
			threads[i].start();
			
			start=start+range;
			end=end+range;
		}
		
		 for(int i=0;i<numthreads;i++) 
		 {
	            threads[i].join();
		 }
		
		Collections.sort(generateprime.listofprimes);
		System.out.println("List Of Primes in Range:"+limit+" are\n"+generateprime.listofprimes);
	}
}
