package lang.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Multiple copies of string
		 */
		ArrayList<String> alist = new ArrayList<String>(Collections.nCopies(10, "A"));
		System.out.println("Multiple copies:");
		System.out.println(alist);

		/***
		 * Multiple coipies of number
		 */

		ArrayList<Integer> alist1 = new ArrayList<Integer>(Collections.nCopies(5, 4));
		System.out.println("Multiple copies:");
		System.out.println(alist1);

	}

}
