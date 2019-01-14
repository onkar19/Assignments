package lang;

import java.util.Set;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> tree_set=new TreeSet<String>();
		tree_set.add("Mumbai");
		tree_set.add("Pune");
		tree_set.add("Goa");
		tree_set.add("Pune");
		tree_set.add("Bnagalore");
		/***
		 * In tree_set we are sorting the values without printing the duplicate 
		 * values 
		 */
		System.out.println("Sorted values:");
		System.out.println(tree_set);

	}

}
