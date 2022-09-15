package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Class {

	
	void methods()
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.offer("First");
		pq.offer("Second");
		pq.offer("Third");
		pq.offer("Fourth");
		pq.offer("Fifth");
		System.out.println("Elements are :"+pq);
		Iterator<String> itr=pq.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}
		System.out.println("Poll Elements : "+pq.poll());
		System.out.println("After Poll elements : "+pq);
		System.out.println("Peek Elements : "+pq.peek());
		pq.add("Sixth");
		System.out.println("After Add :  "+pq);
	}
	public static void main(String[] args) {
		
			new PriorityQueue_Class().methods();
	}

}
