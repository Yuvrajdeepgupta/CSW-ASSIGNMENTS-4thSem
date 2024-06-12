class MyObject
{
	private final int limit;
	private boolean flag=true;
	private int count=1;
	
	public MyObject(int limit) 
	{
		this.limit=limit;
	}
	
	synchronized void evennumbers()
	{
		while(count<=limit)
		{
			while(flag)
			{
				try{wait();}catch(Exception e) {};
			}
			
			if(count%2==0)
			{
				System.out.println("Even->"+count);
				try{Thread.sleep(500);;}catch(Exception e) {};
			}
			
			count++;
			flag=true;
			notify();
		}
	}
	
	synchronized void oddnumbers()
	{
		while(count<=limit)
		{
			while(!flag)
			{
				try{wait();}catch(Exception e) {};
			}
			
			if(count%2!=0)
			{
				System.out.println("Odd->"+count);
				try{Thread.sleep(500);;}catch(Exception e) {};
			}
			
			count++;
			flag=false;
			notify();
		}
	}
}

public class prog_4 
{
	public static void main(String[] args) 
	{
		MyObject data=new MyObject(20);
		
		Thread even=new Thread(()->
		{
			data.evennumbers();
		});
		
		Thread odd=new Thread(()->
		{
			data.oddnumbers();
		});
		
		even.start();
		odd.start();
	}
}
