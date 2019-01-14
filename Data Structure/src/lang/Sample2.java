package lang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Sample2
{

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("D");
		System.out.println("Given elements are:");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		System.out.println("Sorted elements:");
		Set<String> set = new TreeSet<String>(list);
		System.out.println(set);
		System.out.println();
		ListIterator lt = list.listIterator();
		System.out.println("In forward direction:");
		while(lt.hasNext())
		{
			System.out.print(lt.next()+ " ");
		}
		System.out.println();
		ListIterator lt1 = list.listIterator(list.size());
		System.out.println("In backward direction:");
		while(lt1.hasPrevious())
		{
			System.out.print(lt1.previous()+ " ");
		}
		System.out.println();
		

	}

}
