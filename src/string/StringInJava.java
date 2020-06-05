package string;
/**
 * 
 * @author Suraj Shrestha
 *String is final class which means no class can extend it
 *String class is immutable class. Object once created cannot be changed
 *
 *String str1="Suraj";
 *If I write str1="Ramesh";  Object is not changed rather new object is created
 *and the str1 points to this new object where as the old object becomes garbage
 *
 *
 *If two or more variable have same String data as value, both of the reference
 *variables will be pointing at same object
 *Example:
 *	String str1="My name is Suraj."
 *	String str2="My name is Suraj."
 *	String str3="My name is"+"Suraj"
 *	String name="Suraj"
 *	String str4="My name is "+name 
 *	ALL OF THESE ARE POINTING AT SAME OBJECT AT SAME MEMORY LOCATION
 *
 *If you want to create different object for same string
 *String str1=new String("My name is Suraj");
 *
 *String class is in java.lang.String class
 *Final class cannot be extended
 */

public class StringInJava {

	public static void main(String[] args) {
		String s1="computer";
		String s2="computer";
		String s3=new String("computer");
		System.out.println(s1==s2); //Retruns true because object address is same
		System.out.println(s1==s3); //Returns false because object address is different
		System.out.println(s1.equals(s2)); //Returns true as both strings are same
		System.out.println(s1.equals(s3)); //Returns true as both strings are same
		

	}

}
