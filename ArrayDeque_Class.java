package Collections;

import java.util.*;

class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class ArrayDeque_Class {

	
	void methods()
	{
		Deque<Book> ad=new ArrayDeque<Book>(); 
		Book a1 = new Book(45,"girjesh","brijesh","java",47);
		ad.add(a1);
		System.out.println(ad);
		for(Book b:ad)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity+"\n");   
		}
		Deque<String> ad1=new ArrayDeque<String>();
		ad1.offer("First");
		ad1.offer("Second");
		ad1.offer("Third");
		ad1.offer("Fourth");
		System.out.println(ad1);
		ad1.offerFirst("Zero");
		System.out.println("Offer First : "+ad1);
		ad1.offerLast("Last");
		System.out.println("Offer Last : "+ad1);
		ad1.pollFirst();
		System.out.println("Poll First : "+ad1);
		ad1.pollLast();
		System.out.println("Poll Last : "+ad1);
		ad1.peekFirst();
		System.out.println("Peek First : "+ad1);
		ad1.peekLast();
		System.out.println("Peek Last : "+ad1);
		
		
		
	}
	public static void main(String[] args) {
	 
		new ArrayDeque_Class().methods();
	}

}
