package collectioninterface;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * # Cursonr is an interface
 * -->  Cursors are used to retrieve data from collection object, one by one
 * -->	There are three cursors in Java
 * 		$ Enumeration
 * 			->  Enumeration is an interface in java
 * 			->  Enumeration is only available for legacy classes like <Vector> and <Stack>
 * 			->  An object that implements Enumeration interface generates a series
 * 			    of elements, one at a time.
 * 			->  Successive calls to the nextElement method return successive elements
 * 				of the series	
 * 		$ Iterator
 * 			->	Itrator is available for all collection implemented class
 * 			->	All collection implemented classes provide a method called iterator()
 * 			->	Iterator i=collectionObject.iterator();
 * 			-> New Methods: hasNext(), next() and remove()
 * 		
 * 		@Drawbacks_of_Enumerator_and_Iterator
 * 		$ Enumeration and Iterator, both can move in single direction cursors.
 * 		$ Only read and remove oprations are available
 * 			-> Not able to add new objects
 * 			-> Not able to replace any elements
 * 		
 * 		$ ListIterator
 * 			-> ListIterator is child interface of iterator
 * 			-> ListIterator is bidirectional cursor
 * 			-> All List implemented classes provide a method called listIterator()
 * 				$ public ListIterator listIterator()
 * 			-> @Methods
 * 				$ int nextIndex(); boolena hasPrevious(); Object previous();  
 * 				  int previousIndex();  void set(E e);  void add(E e);
 * 
 * @author suraj
 *
 */

public class CursorsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		//Only applies in Vector and Stack
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println("Emulator Data: "+e.nextElement());
		}
		System.out.println("----------------");
///////////////////////////////////////////////////////////////////////////////////////////
		//Iterator is present in all classes that implement Collection interface
		ArrayList a1=new ArrayList();
		for(int i=1;i<=10;i++) {
			a1.add(i);
		}
		System.out.println(a1); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Iterator data=a1.iterator();
		while(data.hasNext()) {
			Integer i=(Integer) data.next();
			if(i>3 && i<8) {
				//The iterator removes the element from the list that satisfies the condition
				data.remove();
			}
		}
		System.out.println(a1);// [1, 2, 3, 8, 9, 10]
/////////////////////////////////////////////////////////////////////////////////////////////
		
		ListIterator listIterator=a1.listIterator();
		
		
	}

}
