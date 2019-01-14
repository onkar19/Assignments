package lang;

import java.util.HashSet;
import java.util.Set;

public class Hash_set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>set=new HashSet<Integer>();
		set.add(5);
		set.add(2);
		set.add(6);
		System.out.println(set);
		set.remove(5);
		System.out.println(set);

	}

}
