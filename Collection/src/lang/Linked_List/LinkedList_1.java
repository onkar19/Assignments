package lang.Linked_List;

import java.util.LinkedList;

public class LinkedList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("onkar");
		list.add("anant");
		list.add("vijay");
		list.add("raj");
		list.add("ramesh");
		list.add("suresh");
		System.out.println("LINKED LIST CONTENT ARE:- " + list);
		System.out.println("AFTER ITERARTING THE CONTENT ARE:-");
		for (String str : list) {
			System.out.println(str);
		}
		list.addFirst("gupta");
		list.addLast("kumar");
		System.out.println("AFTER ADDING AT FIRST AND LAST PLACE: "+list);
		list.add(2, "gupta");
		System.out.println("AFTER ADDING AT INDEX 2: "+list);
		list.removeFirst();
		list.removeLast();
		System.out.println("AFTER REMOVING FIRST AND LAST: "+list);
		list.remove(3);
		System.out.println("FINAL CONTENT: "+list);
		
		/***
		 * CLONEING OF CONTENT
		 */
		
		Object str = list.clone();
		System.out.println("AFTER CLONING: "+str);
		System.out.println(list.size());
        /***
         * Getting first and last elememnt
         */
		
		Object str1 = list.getFirst();
		System.out.println(str1);
		
		Object str2 = list.getLast();
		System.out.println(str2);
		
		/***
		 * REPLACE VALUE
		 */
		
		list.set(2, "manu");
		System.out.println(list);
		
		/***
		 * ELEMENT IS THERE OR NOT
		 */
		
		if(list.contains("onkar"))
			System.out.println("ELEMENT IS PRESENT");
		else
			System.out.println("ELEMENT IS NOT PRESENT");
		
	}

}
