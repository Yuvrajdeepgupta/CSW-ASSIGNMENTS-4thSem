import java.util.*;
public class prog_12 
{
	public static void main(String[] args) 
	{
		int a[]={1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
		
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		
		for(int i=0;i<a.length;i++)
		{
			minHeap.offer(a[i]);
		}
		
//		Dequeue elements
		while(!minHeap.isEmpty())
		{
			int num=minHeap.peek();
			System.out.println(num);
			
			minHeap.poll();
		}
	}
}
