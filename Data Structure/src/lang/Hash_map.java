package lang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println("Initial values of the hash map:");
		System.out.println();
		hm.put(2, "ONKAR");
		hm.put(3, "RAVI");
		hm.put(5, "VIJAY");
		hm.put(4, "ANANT");
		System.out.println(hm);
		System.out.println("-------------------------------");
		System.out.println("After adding new values:");
		hm.put(6, "RAJ");
		/*
		 * for(Map.Entry m:hm.entrySet()) { System.out.println(m.getKey()+ " "
		 * +m.getValue()); }
		 */
		Set<Integer> set = hm.keySet();
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			int var = itr.next();
			String str = hm.get(var);
			System.out.println(var + " => " + str);
		}
		System.out.println("-------------------------------");
		Set<Map.Entry<Integer, String>> entry = hm.entrySet();
		for (Map.Entry<Integer, String> en : entry) {
			int var = en.getKey();
			String str = en.getValue();
			System.out.println(var + " => " + str);
		}

	}

}
