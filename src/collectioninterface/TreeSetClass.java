package collectioninterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 
 * -->  TreeSet is an implementaion class of NavigableSet
 * -->	Duplicates are not allowed
 * -->	Store elements in some logical order (sorted)
 * -->	Heterogenous objects are not allowed
 * -->	Null Values are acceptable for empty TreeSet
 * -->	For Non empty TreeSet Null is not accepteable
 * 
 * -->	@constructors
 * 		$ TreeSet()
 * 			->  Constructs a new empty tree set, sorted accourding to the natural orderring of its elements
 * 		$ TreeSet(Comparator c)
 * 			-> Constructs a nuew epmty tree set, sorted accourding to the specified comparator.
 * 		$ TreeSet(Collection c)
 * 			->  Constructs a new tree set containing the elements in the specified collection, sorted to 
 * 				natural ordering of its elements
 * 		$ TreeSet (SortedSet s)
 * 			->	Constructs a new tree set containing the same elements and using the same ordering as
 * 				the specified sorted set
 * 
 * -->  Defaulti Natural Sorting order work for 
 * 		$ Homogenous Objects
 * 		$ Comparable Objects
 * 
 * -->  COMPARATOR (its different than Comparable)
 * 		$ Comparable is used for default natural sorting order
 * 		$ Comparator is used for custom sorting order
 * 		$ Comparator interface resides in java.util package
 * 		$ Has two different methods
 * 			->  int compara(Object ob1, Object ob2);
 * 			->  equals(); <Optional>
 * 
 * @author suraj
 *
 */
public class TreeSetClass {

	public static void main(String[] args) throws ClassCastException {
		TreeSet<String> t=new TreeSet<String>();
		//PART 1
//		t.add(null); //This is possible but will throw and error
//		System.out.println(t);
		
		//Part 2
		t.add("D");
		t.add("B");
		t.add("C");
		t.add("A");
		System.out.println(t);
		//Default natural sorting
		//For string objects its on dictionary order
		//For integer object it is ascending order
		
		
		//See the Test class at bottom
		//Sorting the data based on id number
		//Implement Test class with Comparable interface overwriting the compareTo method
		//See at the bototm to know what happened
		TreeSet<Test> t1=new TreeSet<Test>();
		Test tA=new Test(3,"Suraj");
		Test tB=new Test(1,"Ramesh");
		Test tC=new Test(2,"Bimarsh");
		t1.add(tA);
		t1.add(tB);
		t1.add(tC);
		System.out.println(t1);
		
		
		//Using a comarator
		TreeSet<Test> t2=new TreeSet<Test>(new MyComparator());
		t2.add(tA);
		t2.add(tB);
		t2.add(tC);
		System.out.println(t2);
		
	}

}
class Test implements Comparable{
	private int id;
	private String name;
	public Test(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return id+": "+name;
	}

	@Override
	public int compareTo(Object o) {
		if(((Test) o).getId()>this.getId()) {
			return -1;
		}
		else if(((Test) o).getId()<this.getId()) {
			return +1;
		}else {
			return 0;
		}
	}
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		/**
		 * Returns negative if obj1<obj2
		 * Returns positive if obj1>obj2
		 * REturns zero if obj1 and obj2 are equal
		 */
		
		Test second=(Test) o1;
		Test first=(Test) o2;
		if(first.getId()>second.getId()) {
			return 1;
		}else if(first.getId()<second.getId()) {
			return -1;
		}
		return 0;
	}
	
	public boolean equals() {
		/**
		 * dummy method (implementation is optional)
		 */
		return true;
	}
	
}
