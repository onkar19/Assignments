package lang;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class ListIterator1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		ListIterator lt =  list.listIterator();
		System.out.println("Forward : ");
		while(lt.hasNext())
		{
			System.out.print(lt.next()+" ");
		}
		ListIterator lt1 =  list.listIterator(list.size());
		System.out.println();
		System.out.println("backward");
		while(lt1.hasPrevious())
		{
			System.out.print(lt1.previous()+" ");
		}
		System.out.println();
		LinkedList<Integer> lt2=new LinkedList<Integer>();
		lt2.add(5);
		System.out.println(lt2);
		
		

	}

}
