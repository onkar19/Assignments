package lang;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Here we are giving the values
		 */
		Set<String> set = new HashSet<String>();
		set.add("B");
		set.add("A");
		set.add("D");
		set.add("C");
		set.add("A");
		/***
		 * In Hash_set we are printing the values without any duplicate
		 */
		System.out.println("Set output without duplicate:");
		System.out.println(set);
		System.out.println("-------------------------");
		/***
		 * In Tree_set we are sorting the values in ascending order
		 */
		System.out.println("Sorted set :");
		Set<String> tree_set = new TreeSet<String>(set);
		System.out.println(tree_set);

	}

}
