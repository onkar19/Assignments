package lang;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_set2 {

	public static void main(String[] args) {
		Set<String>hash_Set=new HashSet<String>();
		hash_Set.add("Mumbai");
		hash_Set.add("Patna");
		hash_Set.add("Mumbai");
		hash_Set.add("Goa");
		Iterator<String> itr=hash_Set.iterator();
		System.out.println("Output without duplicate:");
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
			 
		 

	}

}
