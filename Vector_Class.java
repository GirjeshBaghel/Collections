package Collections;

import java.util.*;

public class Vector_Class {

	
	void methods()
	{
		Vector<String> vec = new Vector<String>(10);  
		Vector<String> vec2 = new Vector<String>();  
		vec.add("Raju");
		vec.add("Mohan");
		vec.add("Deepak");
		vec.add("Prem");
		vec2.add("Ramu");
		vec2.add("Deepak");
		vec2.add("Mohan");
		System.out.print(vec);
		vec.addElement("Prem Singh");
		System.out.println("\nSize is: "+vec.size());  
        System.out.println("Default capacity is: "+vec.capacity());  
        if(vec.contains("Deepak"))
        {
        	System.out.println("Index of Deepak : "+vec.indexOf("Deepak"));
        }
        System.out.println("The first animal of the vector is = "+vec.firstElement());   

        System.out.println("The last animal of the vector is = "+vec.lastElement());   
        System.out.println("Remove element at index 4: " +vec.remove(4));  
        System.out.println("Remove element at index 4: " +vec.remove("Prem"));  
        System.out.println(vec); 
        vec.ensureCapacity(20);
        System.out.println(" Capacity : "+vec.capacity());
        vec.retainAll(vec2);
        System.out.println("After Retain Method : "+vec);
		
	}
	public static void main(String[] args)
	{
		new Vector_Class().methods();
	}
}
