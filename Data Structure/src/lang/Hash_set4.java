package lang;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,7,1,3,4,6,9,11,4};
		Set <Integer> set = new HashSet<Integer>();
		try
		{
		for(int i=0;i<7;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);
		System.out.println("Array lenght:"+arr.length);
		System.out.println("Sorted set:");
		//Set <Integer> tree_set=new TreeSet<Integer>(set);
		TreeSet sortedSet=new TreeSet<Integer>(set);
		System.out.println(sortedSet);
		System.out.println("The first element of set is:"+(Integer)sortedSet.first());
		System.out.println("Last element of set is:"+(Integer)sortedSet.last());
		}
		catch(Exception E){}

	}

}
