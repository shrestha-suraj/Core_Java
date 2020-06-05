package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * -->  Collection is an interface
 * -->	Collections is a class
 * 		$ Collections class provides several utility methods like sort()
 *
 * -->	List
 * 		$ Duplicates allowed
 * 		$ Insertion Order is preserved
 * 
 * -->	Methods of Collection
 * --------------------------------------------------------------------------------------------
 * 		$ boolean add(Object o);
 * 			-> Add an object to the collection
 * 		$ boolean addAll(Collection c);
 * 			-> Add all the objects of specified collection
 * 		$ boolean remove(Object o);
 * 			-> Removes a single instance of the specified element from this collection
 * 		$ boolean removeAll(Collection c);
 * 			-> Removes all of this collection's elements that are also contained in specified collection
 * 		$ boolean retainAll(Collection c);
 * 			-> Retains only the elements in this collection that are contained in specified collection
 * 		$ int size()
 * 			-> Returns the number of elements in this collection
 * 		$ boolean contains (Object o)
 * 			-> Returns true if this collection contains the specified object
 * 		$ void clear();
 * 			-> Removes all of the elements from this collection
 * 		$ boolean isEmpty()
 * 			-> Returns true f this collection contains no elements
 * 		$ Iterator <E> iterator()
 * 			-> Returns an iterator over the elements in this collection
 * 
 * -->  Methods of List Interface
 *--------------------------------------------------------------------------------------
 *		$ void add (int index, E element)
 *			-> Inserts the specified element at the specified position in list (elements may shift)
 *		$ E set (int index, E element)
 *			-> Replaces the element at the specified position in this list with the specified element
 *		$ E get (int index)
 *			-> Returns the element at the specified position in this list.
 *		$ E remove  (int index)
 *			-> Removes the element at given index and returns it
 *		$ List<E> subList (int fromIndex, int toIndex)
 *			-> Returns a view of the protion of this list between fromIndex inclusive and toIndex exclusive
 * 
 * -->  <ArrayList>
 * ----------------------------------------------------------------------------------------
 * 		$ ArrayList is defined using dynamivc arrays
 * 		$ Therefore it is resizable
 * 		$ Duplicates are allowed
 * 		$ Order of elements are preserved
 * 		$ Null insertion is possible
 * 		$ Heterogenous objects are allowed
 * 		$ Except TreeSet and TreeMap Heterogenous objects are allowed
 * 
 * --> ArrayList if not specified size will have default capacity of 10
 * --> If the data insertion goes more than n new size is determined by formula (n*3/2)+1
 * @author Suraj Shrestha
 *
 */

public class Collection_List_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);//Adding element to a collection (Returns boolean)
		list.add(2);
		System.out.println(list); // [1,2]
		HashSet hs=new HashSet();
		hs.add(3); // (Returns boolean)
		hs.add(4); // (Returns boolean)
		System.out.println(hs);// [3, 4]
		list.addAll(hs); // Adding all elements of collection "hs" to collection "list" returns boolean
		System.out.println(list); // [1, 2, 3, 4]
		list.removeAll(hs); //Removes the collection hs data from list
		System.out.println(list);
		
		//If you want to store non relatable data in ArrayList do this
		// ArrayList list=new ArrayList(); list.add("Suraj") list.add(123) all works
		list.addAll(hs);
		list.retainAll(hs); //Removes all other data collection except that of hs.. returns boolean
		System.out.println(list); // [3, 4] 
		
		System.out.println(list.size()); // 2  // Returns the number of elements in collection
		
		System.out.println(list.contains(2)); // false //Returns boolean for object existance in collection
		
		Iterator test=list.iterator(); //Iterates through the element of the collection
		System.out.println(test.next());	//Returns 3
		System.out.println(test.next());	//Returns 4
		
		list.add(1,10);
		System.out.println(list); // [3, 10, 4] //Adds 10 on index 1 of the list
		
		list.set(1, 100);
		System.out.println(list); // [3, 100, 4] //Replaces 10 on index 1 of the list with 100
		
		System.out.println(list.get(1)); // 100 //Returns data at given index
		
		System.out.println(list.indexOf(100));// 1 //Returns index of object 100
		
		System.out.println(list.lastIndexOf(100));//1 //Returns index of object 100 starting from last
		
		System.out.println(list.remove(1)); //100 //Removes the obect at index 1 and reutrns it as well
		
		System.out.println(list.subList(0, 1)); // [3] returns a sublist from 0 index inclusive to 1 exclusive
		
		
		
		
	}

}


