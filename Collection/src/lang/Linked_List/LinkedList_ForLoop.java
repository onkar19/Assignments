package lang.Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("onkar");
		list.add("vijay");
		list.add("anant");
		list.add("kumar");
		list.add("raj");
		/***
		 * USING FOR LOOP 
		 */

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		/***
		 * ADVANCED LOOP
		 */
		
		System.out.println("ADVANCED LOOP:");
		for(String str : list)
		{
			System.out.println(str);
		}
		  System.out.println();
		/***
		 * ITERATOR 
		 */
		System.out.println("**USING ITERATOR:**");
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
