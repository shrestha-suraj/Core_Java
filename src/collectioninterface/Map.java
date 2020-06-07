package collectioninterface;
/**
 * <Map>
 * -->  Map is not child interface of Collection framework
 * -->	Whenever we want to store group of key-value pair, we use Map
 * -->	Key and value both must be objects
 * -->	Values can repeat but not keys
 * -->	All map implementation class es should provide two  "standard" constructors:
 * 		$ A void (no arguments) constructor which creates an empty map
 * 		$ a constructor with a single argument of type Map, which creates a new mao
 * 		  with same key-value mappings its argument.
 * -->	A map entry (key-value pair)
 * -->	Inner Interface of Map
 * -->	Methods of Entry
 * 		$ public Object getKey(): is used to obtain key 
 * 		$ public Object getValue(): is used to obtain value
 * 		$ public Object put(Object key, Object value) -> used to insert an entry in map
 * 		$ public void putAll(Map map)  -> used to insert the specified map in this map
 * 		$ public Object remove(Object key)  -> used to delete an entry for the specified key
 * 		$ public Object get(Object key)		-> used to return the value for the specified key
 * 		$ public boolean containsKey(Object key)  -> used to search the specified key from this map
 * 		$ public Set keySet() -> used to return the Set view containing all the keys
 * 		$ public Set entrySet()	  -> used to return the Set view containing all the keys and values
 * 
 * <HashMap>
 * 
 * -->  A HashMap contains values based on the key
 * -->	Hash table data structure is used
 * -->	It contains only unique elements
 * -->	It may have one null key and multiple null values
 * 		
 * 		@Look_Documentation_Java_Website
 * 
 * <HashTable>
 * 
 * -->	This is thread safe version of HashMap
 * -->	Unsorted and unordered
 * -->	Hash table is the data structure used
 * -->	Hashtable doesnot allow null value like HashMap
 * 
 * <LinkedHashMap>
 * 
 * -->	Subclass of HashMao
 * -->	Insertion order is maintained
 * -->	Slower insertion and deletion
 * -->	Hybrid data structure is used
 * 
 * <SortedMap>
 * 
 * -->	Child interface of Map
 * -->	Whenever a group of key-value pairs needs to be stored in some sorted order,
 * 		we used SortedMap
 * -->	Sorting logic applies on keys
 * 
 * <NavigableMap>
 * 
 * --> It is a child interface of SortedMap
 * -->	Several utility methods it provides to navigate in SortedMap
 * 
 * <TreeMap>
 * 
 * -->	It implements NavigableMap (so SortedMap and Map)
 * -->	Sorted order is maintained
 * -->	It is not thread safe
 * -->	The map is sorted accordingly to the natural ordering of its keys or by
 * 		a cComparator provided at map creation time, depending on which constructor is used
 * -->	A Red-Black tree based NavigableMap implementation
 * 		
 * @author suraj
 *
 */
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
