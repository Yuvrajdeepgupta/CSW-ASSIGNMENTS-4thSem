import java.util.*;
class Book {
    private int id;
    private String name;
    private String author;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}

class Library
{
	private HashMap<Integer,Book> map1;
	
	public Library() 
	{
		map1=new HashMap<>();
	}
	
	void addBook(int quantity,Book book)
	{
		map1.put(quantity,book);
	}
	
	void removeBook(Book book)
	{
		map1.remove(book);
	}
	
	void displayBooks()
	{
		Iterator<Map.Entry<Integer,Book>> i1=map1.entrySet().iterator();
		
		while(i1.hasNext())
		{
			Map.Entry<Integer,Book> entry=i1.next();
			
			System.out.println("ID: " + entry.getValue().getId() + ", Book: " + entry.getValue().getName()
                    + ", Author: " + entry.getValue().getAuthor() + ", Quantity: " + entry.getKey());
		}
	}
	
	void removeBookbyKey(int key)
	{
		if(map1.containsKey(key))
		{
			map1.remove(key);			
		}
		else
		{
			System.out.println("Key Not Found!");
		}
	}
	
	boolean containsBook(Book book)
	{
		if(map1.containsValue(book.getName()))
		{
			return true; 
		}
		return false;
	}
}
public class prog_5 
{
	public static void main(String[] args) 
	{
		Library library = new Library();

        Book book1 = new Book(1, "Harry Potter", "J.K. Rowling", 5);
        Book book2 = new Book(2, "The Great Gatsby", "F. Scott Fitzgerald", 3);
        
        library.addBook(5, book1);
        library.addBook(7, book2);
        
        library.displayBooks();
        
        System.out.println("Does Library Contains the Book:"+library.containsBook(book2));
        
        library.removeBookbyKey(7);
        System.out.println("Book Removed");
	}
}
