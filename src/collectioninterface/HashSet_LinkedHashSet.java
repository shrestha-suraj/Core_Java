package collectioninterface;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * -->  Set is a child interface of Collection interface
 * -->	Duplications are not allowed
 * -->	Insertion order is not preserved
 * -->	Set interface does not contain any new methods
 * 
 * -->	Hash Table is the data structure
 * -->	If you try to insert duplicate object, add method simply
 * 		returns false, as duplicates are not allowed
 * -->	Insertion order is not preserved but all objects are inserted
 * 		based on hash code.
 * -->	Heterogenous objects are allowed
 * -->	Null values are allowed
 * -->	Provide efficient searching
 * 
 * -->	@Constructors
 * 		$ HashSet()
 * 			-> Default capacity 16
 * 			-> After 75% is filled, it grows dynamically.
 * 		$ HashSet (int capacity)
 * 			-> Load factor is 0.75
 * 		$ HashSet (int capcaity, float loadFactor)
 * 		$ HashSet (Collection c)
 * 
 * # LinkedHashSet preserved insertion order
 * 
 * -->  Child class of HashSet is LinkedHashSet
 * -->	Insertion Order is preserved unlike HashSet
 * -->	Hash Table and Doubly LinkedList both are used  (hybrid DS)
 * -->	@Constructor_Same_as_Hash_Set
 * 
 * 
 * @author suraj
 *
 */

public class HashSet_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add(1); 	//Returns true or fase
		hs.add(2);	//False if object is duplicate
		hs.add(3);	//True if object is original
		hs.add(4);
		hs.add(5);// Order is not preserved
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		hs.add(10);
		System.out.println(hs); // [1, 2, 3] // notice that 3 did not repeat
		
		ArrayList arr=new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		System.out.println(arr);
		
		HashSet hs1=new HashSet(arr);
		System.out.println(hs1);
		
		
	}

}
