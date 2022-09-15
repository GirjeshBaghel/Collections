package Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linked_List {
	static int roll = 10;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Linked_List obj=new Linked_List();
		obj.demo();

	}
	public void demo()
	{
		System.out.println(roll);
		LinkedList<String> name=new LinkedList<>();
		name.add("Neha");
		name.add("Aram");
		name.add(1,"Pooja");
		name.addLast("Rajender");
		name.add(1,"Manish");
		name.set(1,"Monika");
		//System.out.println("NAme are:"+name);
		
		Iterator<String> it=name.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("The 3rd name is ="+name.get(2));
		name.remove("Aram");
		System.out.println("NAme are:"+name);
		List<String> l2=new LinkedList<>();
		l2.addAll(name);
		l2.add("java");
		System.out.println("The new list is ="+l2);
		System.out.println("The new list is ="+l2.size());
		System.out.println("The new list is ="+l2.contains("Hello"));
		System.out.println("The new list is ="+name.containsAll(l2));
		System.out.println("The new list is ="+l2.equals(name));
		System.out.println("The new list is ="+l2.isEmpty());
	}
	public void demo1()
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> d1=new LinkedList<>();
		System.out.println("Enter your name");
		String ch="";
		do
		{
			ch=sc.next();
			d1.add(ch);	
		}
		while(!ch.equalsIgnoreCase("NO"));
		//System.out.println("names="+d1);
		d1.remove("NO");
		System.out.println("names="+d1);
	}
}

