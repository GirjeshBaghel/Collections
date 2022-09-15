package Collections;

import java.util.*;

public class Stack_Class {

	void methods()
	{
		Stack<Integer> st= new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println("Pushing Elements  : "+st);
		System.out.println("Empty or Not  : "+st.empty());
		System.out.println("POP Element  : "+st.pop());
		System.out.println("After POP  : "+st);
		System.out.println("Peek Element  : "+st.peek());
		System.out.println("Search Element  : "+st.search(3));
		System.out.println("Size of Stack  : "+st.size());
		for(Integer str:st)
		{
			System.out.println(" Elements are : "+str);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		new Stack_Class().methods();
	}
}
