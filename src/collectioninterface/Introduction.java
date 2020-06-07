package collectioninterface;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * -->  The Collections Framework provides a well-desogned set of interfaces and classes
 * 		for storing and manipulating groups of data as a single unit, a collection.
 * -->  Collection framework contains the following
 * 		$ Interfaces --> These are abstract data types that represent collections.
 * 		$ Implementations (classes) --> These are the concrete implementations of
 * 										collection interfaces.
 * 		$ Algorithms --> These are the methods that perform useful computations, such as
 * 						 searching and sorting, on objects that implement collection interfaces.
 * -->	If the size is known Array is a better choice in terms of performace.
 * -->	Collection provides flexibility in memory which increases the time complexity.	
 * 
 * -->  Collection
 * 		$ For group of objects
 * -->	List (Child Interface of Collection)
 * 		$ Duplicates allowed
 * 		$ Insertion order must be preserved
 * 		$ ArrayList, LinkedList, Vector, Stack are the implementation classes
 * -->  Set
 * 		$ A collection that cannot contain duplicate elements
 * 		$ Insertion order is not preserved
 * 		$ HashSet, LinkedHashSet are the classes implemented Set interface
 * -->	SortedSet
 * 		$ Child interface of Set
 * 		$ cannot contain duplicate elements
 * 		$ Some sorted order
 * -->	NavigableSet
 * 		$ Child interface of SortedSet
 * 		$ It defines several methods for navigation purpose
 * 		$ TreeSet is implementation class
 * -->	Queue
 * 		$ Child interface of Collection
 * 		$ PriorityQueue, BlockingQueue, LinkedBlockingQueue, PriorityBlockingQueue
 * -->	Map (Doesnot have direct relation with Collection Interface)
 * 		$ It is used to represent group of objects as key-value pairs
 * 		$ Map is not a child interface of Collection
 * 		$ Key and values both are objects
 * 		$ Keys must be unique but values can repeat
 * 		$ HashMap, LinkedHashMap, WeakHashMap,IdentityHashMap,Hashable
 * 		$ SortedMap (Child Interface of Map)
 * 			--> It is used to represent group of objects as key-value pairs
 * 			--> Child interface of Map
 * 			--> Some sorting order
 * 		$ NavigableMap (Child Interface of SortedMap)
 * 		$ TreeMap (Implements NavigableMap)
 * -->	Comparable
 * 		$ Interface for default sorting
 * -->	Comparator
 * 		$ Intreface for customized sorting
 * -->	Utility Class
 * 		$ Collection 
 * 		$ Arrays
 * 
 *  						  <Collection>
 *_______________________________________________________________________________________
 *|    	<List>			|		   <Set>				  	|			<Queue>			 |	   
 *|--------------------------------------------------------------------------------------|    									
 *| 	  <ArrayList>	|<HashSet> Ex: <LinkedHashSet>		|							 |
 *| 	 <LinkedList>	|		<SortedSet>			  		|							 |
 *| <Vector> Ex:<Stack>	|<SortedSet> Ex: <NavigableSet>	Ex:	|							 |
 *| 					|		<TreeSet>					|							 |
 *|_____________________|___________________________________|____________________________|
 * 
 * @author suraj
 *
 */
public class Introduction {

	public static void main(String[] args) {

	}

}
