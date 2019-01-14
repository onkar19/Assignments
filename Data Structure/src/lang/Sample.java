package lang;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		Iterator<Integer> it=list.iterator();
		list.add(12);
		/*
		 * while(it.hasNext()) { System.out.println(it.next()); //it.add(12); }
		 */
		System.out.println("Given element are:");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		ListIterator lt = list.listIterator();
		System.out.println("In forward direction");
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
	}

}
