package lang;
import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		ll.add(5);
		ll.add(6);
		ll.add(3);
		ll.add(8);
		System.out.println("LinkedList values:");
		System.out.println(ll);
		System.out.println("After adding first and last:");
		ll.addFirst(0);
		ll.addLast(10);
		System.out.println(ll);
		System.out.println("Add element at position 2:");
		ll.add(2, 12);
		System.out.println(ll);
		System.out.println("After removing element:");
		ll.remove(3);
		System.out.println(ll);
		System.out.println("After replacing the element:");
		Object obj=ll.get(2);
		ll.set(2, 14);
		System.out.println(ll);

	}

}
