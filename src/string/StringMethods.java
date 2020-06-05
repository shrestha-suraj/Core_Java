package string;

public class StringMethods {

	public static void main(String[] args) {
		String testString=new String("Hello my name is Suraj Shrestha.");
		System.out.println(testString);
		//Represents string to lower case
		System.out.println(testString.toLowerCase());
		//Represents string to upper case
		System.out.println(testString.toUpperCase());
		//Searching the index of a character in string
		System.out.println(testString.indexOf('S')); //returns 17 //You can also use ascii of S instead of the char
		//Searching the index of a character after certain index
		System.out.println(testString.indexOf('S',18)); //returns 23 // If not found returns -1
		//Searching the index of substring after certain index
		System.out.println(testString.indexOf("res",5)); //returns 25
		
		//Searching the index of character or substring from end of string
		System.out.println(testString.lastIndexOf('S')); //returns 23 not 17 as searching starts from end
		//All other methods follow similar pattern as indexOf
		System.out.println(testString.lastIndexOf('S',22)); //returns 17 as searching starts from index 22 towards 0
	
		//Comparing strings
		System.out.println("Suraj".equals("Suraj")); //returns true
		System.out.println("Suraj".equalsIgnoreCase("suRAJ")); //returns true
		
		//Returns corresponding sting mismatch unicode difference
		System.out.println("coMputer".compareTo("computer"));
		//The difference starts at M and m
		//unicode of M=77 and unicode of m=109
		//Result is 77-109
	
		//if return int is > 0: it means opposite to dictionary order
		//if return int is < 0: it means the strings are in dictionary order
		//if retutns int is =0: the string are the same
		
		System.out.println("Suraj".substring(2)); //returns "raj" beginning from index 3
		System.out.println("Suraj".substring(2, 4)); //returns "ra" beginning from index 3 to 4 
		
	}

}
