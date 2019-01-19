package lang.Vector;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Vector_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		vec.add("mango");
		vec.add("orange");
		vec.add("apple");
		vec.add("guava");
		
		System.out.println("Initial capacity:"+vec.size());
		/***
		 * INITIAL CAPACITY IS 10 BY DEFAULT
		 */
        System.out.println("Default capacity:"+vec.capacity());
        
        vec.add("banana");
        vec.add("grapes");
        vec.add("papaya");
        vec.add("pineapple");
        vec.add("peach");
        vec.add("custurd");
        vec.add("kiwi");
         System.out.println("Size after addition:"+vec.size());
         /***
          * ONCE 11TH ELEMENT ADDED CAPACITY GETS INCREMENTED BY 10
          */
         System.out.println("Capacity after increment is:"+vec.capacity());
         /***
          * GETTING THE FIRST AND LAST ELEMENT
          */
         Object obj = vec.firstElement();
         Object obj1 = vec.lastElement();
         System.out.println("First element:"+obj);
         System.out.println("Last elemnt:"+obj1);
         System.out.println();
         System.out.println("Given element are:-");
         /***
          * HERE WE ARE SORTING THE ELEMENTS
          */
         Collections.sort(vec);
         for(String str : vec)
         System.out.println(str.toUpperCase());
         
	}

}
