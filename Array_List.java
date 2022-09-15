package Collections;
import java.util.*;
import java.util.Scanner;

public class Array_List {

	public static void main(String[] args) {
		
		Array_List ob = new Array_List();
		ob.user_list();
	}
	
	public void user_list()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		int size = sc.nextInt();
		List<Integer> list   = new ArrayList<Integer>(size);
		for(int i=0; i<size;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.print("List : "+list+"\n");
		for(int i=0; i<size; i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.print("\nEnter the index value to be add element : ");
		int dex = sc.nextInt();
		System.out.print("\nEnter the element to be add : ");
		int ad = sc.nextInt();
		list.add(dex, ad);
		System.out.println("New List : "+list);
		
		
	}

}
