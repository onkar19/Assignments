package lang.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(8);
		al.add(9);
		al.add(15);
		al.add(0);
		al.add(1);
		
		System.out.println("Before sorting:");
		for(int num : al) 
		{
			System.out.println(num);
		}
		
		/***
		 * sorted arrayList
		 */
		Collections.sort(al);
		
		System.out.println("After sorting:");
		for(int num : al)
		System.out.println(num);
		
		/***
		 * sorted list in descending order
		 */
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("In descending order:");
		System.out.println(al);

	}

}
