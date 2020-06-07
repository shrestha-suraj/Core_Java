package collectioninterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set interface doesnot have any methods in built it
 * Hence any class that implements Set will implement all the methods of Collection
 * 
 * -->  SortedSet is a child interface of Set interface
 * -->	Duplicates are not allowed
 * -->	Elements are in sorted order
 * -->	SortedSet interface introduces 6 new methods
 * -->	The main difference between Set and SortedSet is
 * 		$ In Set, order is not important
 * 		$ In SortedSet, order is important (some logical order)
 * 
 * -->  @SortedSet_New_Methods
 * 		$ first() -> Returns the first element of the set
 * 		$ last() -> Returns the last element of the set
 * 		$ headSet(E toElement) 
 * 			-> Returns a view of the portion of this set whose
 * 			   elements are strictly less than toElement.
 * 		$ tailSet (E fromElement) 
 * 			-> Returns a view of the portion of this et whose
 * 			   elements are greater than or equal to fromElement 
 * 		$ subSet (E fromElement, E toElement)
 * 			-> Returns a view of the portion of this set whose elements
 * 			   range from fromElemet, inclusive to toElement, exclusive
 * 		$ comparator()
 * 			-> Returns the comparator used to order the elements in this set,
 * 			   or null if this set uses the natural ordering of its elements.
 * 			-> What kinf of sorting order is being used by the Class
 * 
 * 
 * -->  NavigableSet
 * 		$ Child Interfeace of Sorted Set
 * 		$ Provide methods for nvaigation in sorted list of elements
 * 		
 * 		@Methods_Navigable_Set
 * 		$ ceiltin (E e)
 * 			-> Returns the least element in this set greater than or equal to the given element
 * 			   or null if there is no such element.
 * 		$ floor (E e)
 * 			-> Returns the greatest element in this set less than or equal to the given element
 * 			   or null if there is no such element.
 * 		$ higher (E e)
 * 			-> Returns the least element in this set strictly greater than the given element, or
 * 			   null if there is no such element.
 * 		$ lower (E e)
 * 			-> Returns the greatest element in this set strictly less than the given element, or
 * 			   null if there is no such element.
 * 		$ pollFirst()
 * 			-> Retrieves and removes the first (lowest) element, or returns null if this set is empty.
 * 		$ pollLast()
 * 			-> Retrieves and removes the last (highest) element, or returns null if this set is empty.
 * 
 * 
 * @author suraj
 *
 */
public class SortedSet_NavigableSet {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add("A");
		ts.add("C");
		ts.add("B");
//		ts.add(5);
//		ts.add(1);
//		ts.add(3);
		System.out.println(ts);
		
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("C");
		al.add("B");
		
		TreeSet ts1=new TreeSet(al);
		System.out.println(ts1);
		System.out.println(ts1.first()); //Returns A which is first element on sorted order
		System.out.println(ts1.last()); //Returns C which is last element on sorted order
		
		
		System.out.println(ts1.headSet("C")); //Returns  [A, B]  // returns excluding C
		System.out.println(ts1.tailSet("A")); //Returns [A, B, C] // returns including A

		System.out.println(ts1.subSet("A", "C")); //Returns [A, B] //retuns firs element inclusive
		
		System.out.println(ts1.comparator()); // Returns null as there is no custom order 
		
		System.out.println(ts1.higher("A")); //Returns "B", strictly greater than A
		System.out.println(ts1.ceiling("A")); //Returns "A", greater than or equal to
		
		System.out.println(ts1.lower("B")); //Returns "A", strictly lower than B
		System.out.println(ts1.floor("B"));	//Returns "B", lower than or equal to
		System.out.println(ts1.pollFirst()); //Removes and returns first element of the Set
		System.out.println(ts1.pollLast()); //Removes and returns last element of the Set
	}

}
