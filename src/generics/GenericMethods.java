package generics;
/**
 * -->  Java Generic methods and generic classes enable programmers to specify
 * 		with a single method declaration, a set of related methods or, with a
 * 		single class declaration, a set of related types
 * -->  We can write a single generic method decleration that can be called with
 * 		arguments of different types
 * -->	All generic method declerations have a type parameter section delimited by
 * 		angle brackets (<and>) that precedes the method's return type
 * -->	Each type parameter section contains one or more type parameters seperated
 * 		by commas
 * -->	The type parameters can be used to declare the return type
 * -->	Type parameters can represent only reference types, not primitive types
 * 
 * @author suraj
 *
 */
public class GenericMethods {

	public static void main(String[] args) {
		//Did not know you can create object of self class as well
		GenericMethods gm=new GenericMethods();
		String countries[]=new String[] {"Nepal","Bangladesh","India"};
		Integer[] test={1,2,3,4,5};
		gm.printArray(countries);
		gm.printArray(test);

	}
	
	//In generic method we just put <E> before the return type in the methods
	//Multipe generic type can be created as Example:  public <E1, E2> void printArray
	public <E> void printArray(E[] s) {
		for (E x:s) {
			System.out.println(x);
		}
	}

}

