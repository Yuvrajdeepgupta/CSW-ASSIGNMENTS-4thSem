/*Write a Java program to create a simple calculator that performs arithmetic operations
(addition, subtraction, multiplication, division) using multiple threads. Each arithmetic operation
should be handled by a separate thread.*/

import java.util.*;
public class prog_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int b=sc.nextInt();
		
		//Addition Thread
		Thread additionthread=new Thread(()->
		{
			System.out.println("Addition Thread:"+(a+b));
		});
		
		//Subtraction Thread
		Thread subtractionthread=new Thread(()->
		{
			System.out.println("Subtraction Thread:"+(a-b));
		});
		
		//Multiplication Thread
		Thread multiplicationthread=new Thread(()->
		{
			System.out.println("Multiplication Thread:"+(a*b));
		});
		
		//Division Thread
		Thread divisionthread=new Thread(()->
		{
			try {
				System.out.println("Division Thread:"+(a/b));	
			} catch (Exception e) {
				System.out.println("Wrong Operation! "+e);
			}
		}); 
		
		
		additionthread.start();
		subtractionthread.start();
		multiplicationthread.start();
		divisionthread.start();
	}
}

//Output:
/*Enter the First Number:
2
Enter the Second Number:
3
Subtraction Thread:-1
Multiplication Thread:6
Addition Thread:5
Division Thread:0
*/
