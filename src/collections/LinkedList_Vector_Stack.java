package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Difference_between_ArrayList_LinkedList
 * 
 * # ArrayList -Search/Access is faster
 * # Insertion and Deletion- LinkedList is faster
 * 
 * -->  LinkedList methods
 * 		$ void addFirst(Object o)
 * 		$ void addLast(Object o)
 * 		$ Object getFirst()
 * 		$ Object getLast()
 * 		$ Object removeFirst()
 * 		$ Object removeLast()
 * 
 * -->  Constructors
 * 		$ new LinkedList()
 * 		$ new LinkedList(Collection c)
 * 
 * -->  Vector
 * 		$ Vector is implementation class of List interface
 * 		$ Dynamic Array is used to implement Vector
 * 		$ Duplication is allowed
 * 		$ Insertion order is preserved
 * 		$ Heterogeneous are allowed
 * 		$ Methods are synchronized so thread safe
 * 
 *@Difference_between_ArrayList_Vector
 *		$ ArrayList is not thread safe.
 *		$ ArrayList methods are not synchronized
 *		$ High Peroformance
 *		$ First introduced in version 1.2
 *
 *		$ Vector is thread safe
 *		$ Vector methods are synchronized
 *		$ Low performance
 *		$ First introduced in version 1.0 and reengineered in 1.2
 *
 * 
 * @author Suraj Shrestha
 *
 */

public class LinkedList_Vector_Stack {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("S");
		arr.add("U");
		arr.add("R");
		arr.add("A");
		arr.add("J");
		System.out.println(arr);
		
		list.addAll(arr); //insert elements of collection arr to linked list list
		System.out.println(list);
		
		list.addFirst("M"); //insert on first of linked list
		System.out.println(list);
		list.addLast("T"); //insert on last of linked list
		System.out.println(list);
		
		System.out.println(list.getFirst()); //get first element
		System.out.println(list.getLast());	//get last element
		System.out.println(list.get(2)); //get second index element

		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}

