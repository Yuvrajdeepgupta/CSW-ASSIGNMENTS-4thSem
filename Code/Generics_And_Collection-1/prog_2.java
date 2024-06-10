import java.util.*;
class Book implements Comparable<Book>
{
	private int bookId;
	private String bookName;
	private int bookPrice;
	
	public Book(int bookId,String bookName,int bookPrice)
	{	
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj==this) {return true;}
		
		Book other=(Book) obj;
		return other.bookId==this.bookId && other.bookName==this.bookName && other.bookPrice==this.bookPrice;
	}
	
	@Override
	public String toString() 
	{
		return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + bookPrice;	
	}

	@Override
	public int compareTo(Book o) 
	{
		if(this.bookPrice==o.bookPrice)
		{
			return 0;
		}
		else if(this.bookPrice<o.bookPrice)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}	
}
public class prog_2 
{
	public static void main(String[] args) 
	{
		Book book1 = new Book(101, "Java Programming", 25);
        Book book2 = new Book(102, "Python Programming", 25);

        int comparisonResult = book1.compareTo(book2);

        System.out.println("Details of Book 1:");
        System.out.println(book1);
        System.out.println();

        System.out.println("Details of Book 2:");
        System.out.println(book2);
        System.out.println();

        if (comparisonResult < 0) {
            System.out.println("Book 1 is cheaper than Book 2.");
        } else if (comparisonResult > 0) {
            System.out.println("Book 1 is more expensive than Book 2.");
        } else {
            System.out.println("Book 1 and Book 2 have the same price.");
        }
	}
}
