package lang.Linked_List;
import java.util.Collections;
import java.util.LinkedList;

public class Sort_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("india");
		list.add("usa");
		list.add("china");
		list.add("japan");
		list.add("nepal");

		System.out.println("BEFORE SORTING:");
		for (String str : list)
			System.out.println(str);
		
		
		Collections.sort(list);
		
		System.out.println("AFTER SORTING:");
		for(int i = 0; i<list.size(); i++)
			System.out.println(list.get(i));

	}

}
