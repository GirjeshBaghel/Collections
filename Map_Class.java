package Collections;

import java.util.*;

public class Map_Class {

	void Hash_Map()
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"First");
		hm.put(2,"Second");
		hm.put(4,"Forth");
		hm.put(3,"Third");
		hm.put(2,"Second");
		System.out.println(hm);
		hm.putIfAbsent(5, "Five");
		System.out.println(hm);
		  System.out.println("Updated list of elements:");  
		     hm.replace(102, "Gaurav");  
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		
	}
	
	public static void main(String[] args) {
		Map_Class ob = new Map_Class();
		ob.Hash_Map();
		
	}

}
