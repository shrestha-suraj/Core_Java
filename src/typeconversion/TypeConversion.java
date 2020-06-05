package typeconversion;

/**
 * 
 * @author Suraj Shrestha
 * Testing type conversions for primitive data types
 */

public class TypeConversion {

	public static void main(String[] args) {
		//Converting byte to other number data types
		byte x=100; //byte range is from -128 to +127;
		System.out.println("Byte value is : "+x);
		int y=x; //This is called wide conversion when we store data types of small size to a large size.
		
		/**
		 * Trying the opposite would not work
		 * @Example: int x=1000;
		 *			 byte y=x; //This is called narrow conversion and would have worked if x was less than 127
		 */
		float f=x;//byte to float
		System.out.println(f); //This will work
		
		/**
		 * Conversion Pattern
		 * byte ----> short, int long, float, double
		 * short ---> int, long, float, double
		 * char ----> int, long, float, double
		 * int -----> long, float, double
		 * long ----> float, double
		 * float ---> double
		 */
	}

}
