import java.util.*;

class rowmultiplier implements Runnable
{
	private int[][] a;
	private int[][] b;
	private int[][] c;
	private int i; //row-number
	
	public rowmultiplier(int a[][],int b[][],int c[][],int i) 
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.i=i;
	}
	
	@Override
	public void run() 
	{
		for(int j=0;j<a[i].length;j++)
		{
			for(int k=0;k<a.length;k++)
			{
				c[i][j]+=a[i][k]*b[k][j];
			}
		}
	}
	
}

public class prog_3 
{
	public static void matrixprinter(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int a[][] = 
			{
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		
		System.out.println("Matrix-A:");
		matrixprinter(a);

	    int b[][] = 
	        {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };
	    
	    System.out.println("Matrix-B:");
		matrixprinter(b);
		
		int c[][]=new int[a.length][b[0].length];
		
		Thread threads[]=new Thread[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			threads[i]=new Thread(new rowmultiplier(a, b, c, i));
			threads[i].start();
		}
		
		System.out.println("Matrix-C:");
		matrixprinter(c);
	}
}
