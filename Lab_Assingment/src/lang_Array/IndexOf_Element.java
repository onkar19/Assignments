package lang_Array;

import java.util.ArrayList;

public class IndexOf_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("d");
		list.add("a");
		list.add("d");
		list.add("f");
		list.add("g");
		list.add("h");
		System.out.println(list);
		System.out.println("Index of 'd' = " +list.indexOf("h"));

	}

}
