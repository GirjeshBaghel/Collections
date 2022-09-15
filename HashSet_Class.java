package Collections;

import java.util.*;

public class HashSet_Class {
	
	HashSet_Class()
	{
		 HashSet<String> set=new HashSet<>(); 
		 set.add("One");    
         set.add("Two");    
         set.add("Three"); 
         set.add("Five");
         set.add("Four");  
         set.add("Five"); 
         Iterator<String> it = set.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
         set.remove("Five");
         System.out.println("After Remove Method : "+set);
         
         LinkedHashSet<String> lh=new LinkedHashSet<String>();
         lh.add("First");
         lh.add("Second");
         lh.add("Third");
         lh.add("Forth");
         System.out.println("Linked List : "+lh);
         lh.contains("Third");
         System.out.println("Contains Method : "+lh);
         lh.remove("Forth");
         System.out.println("Remove  Method : "+lh);
	}

	public static void main(String[] args) {
			new HashSet_Class();
	}

}
