import java.util.*;
class sharedresource
{
	 void display(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class prog_5 
{
	static boolean flag=true;
	public static void main(String[] args) throws InterruptedException 
	{
		sharedresource sr=new sharedresource();
		
		Thread t1=new Thread(()->
		{
			if(flag)
			{
				sr.display("Hello World");
				flag=false;
			}
		});
		
		Thread t2=new Thread(()->
		{
			if(!flag)
			{
				sr.display(" Welcome All");
				flag=true;
			}
		});
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
	}
}
