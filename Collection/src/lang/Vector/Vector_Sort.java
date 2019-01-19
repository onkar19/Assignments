package lang.Vector;

import java.util.Collections;
import java.util.Vector;

public class Vector_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		vec.add("C");
		vec.add("D");
		vec.add("E");
		vec.add("F");
		vec.add("B");
		vec.add("A");
		
		System.out.println("Before sorting:-");
		for(String str : vec)
		{
			System.out.println(str);
		}
		System.out.println();
		Collections.sort(vec);
		System.out.println("After sorting:-");
		for(int i = 0; i<vec.size(); i++)
		{
			System.out.println(vec.get(i));
		}

	}

}
