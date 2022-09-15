package Collections;

import java.util.*;

public class TreeSet_Class {

	TreeSet_Class()
	{
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(67);
		set.add(45);
		set.add(14);
		set.add(67);
		set.add(85);
		set.add(96);
		System.out.println("Tree Set : "+set);
		Iterator<Integer> it = set.descendingIterator();
		while(it.hasNext())
		{
			System.out.println("Tree Set : "+it.next());
		}
		System.out.println("Decending Set : "+set.descendingSet());
		System.out.println("Lowest Value: "+set.pollFirst());    
        System.out.println("Highest Value: "+set.pollLast()); 
        System.out.println("Head Set: "+set.headSet(74));  
        
        System.out.println("SubSet: "+set.subSet(01, 94));  
          
        System.out.println("TailSet: "+set.tailSet(18));  
		
	}
	
	public static void main(String[] args) {
	
		 new TreeSet_Class(); 
	}

}
