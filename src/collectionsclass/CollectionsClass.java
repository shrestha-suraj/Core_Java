package collectionsclass;
import java.util.Collections;
import java.util.Vector;

/**
 * <CollectionClass>
 * -->	Collections class resides in util package
 * -->	This class consists exclusively of static methods that operate on or return collections.
 * -->	@Methods_of_Collections
 * 		$ public static void sort (List list);
 * 		$ public static void sort (List list, Comparator c)
 * 		$ public static int binarySearch (List list, T key)
 * 		$ public static int binarySearch (List list, T key, Comparator c)
 * 		$ public static void reverse (List list)
 * 		$ public static void shuffle (List list)
 * 		$ public static void swap (List list, int i, int j)
 * 		$ public static void copy (List destination, List source)
 * 		$ public static T min / max (Collection c)
 * 		$ public static T min / max (Collection c, Comparator comp) 
 * 
 * 
 * @author suraj
 *
 */
public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(20);
		v.add(50);
		v.add(10);
		v.add(30);
		System.out.println(v); // [20, 50, 10, 30]
		
		Collections.sort(v); //Sorting the data
		System.out.println(v); // [10, 20, 30, 50]
		
		//For sorting objects with custom logic we can also pass Comparator object along with the list
		
		//Binary serch can only be applied on sorted list. Be careful about that
		System.out.println(Collections.binarySearch(v, 20)); //Returns index of the element
		
		
		

	}

}
