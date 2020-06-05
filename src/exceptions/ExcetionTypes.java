package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Types of Exceptions:
 * 
 * -> Checked Exceptions (IOException, ClassNotFoundException) -->uses throws on class or try catch
 *  #Checked exceptions forces programmers to deal with exception that may be thrown
 *  #IOException, SQLException, IllegalThreadStateException, etc are some examples
 *  
 * -> Unchecked Exceptions (All runtime exceptions are unchecked)
 * Runtime Exceptions are (IllegalArgumentException, NullPointerException, ArithmeticException)
 * 
 *### checked Exceptions are checked during compile time where as unchecked is checked during run time
 * 
 * ----> Default throw and default catch
 * ----> Default throw and our catch
 * ----> Our throw and default catch
 * ----> Our throw and our catch
 * 
 * @author suraj
 *
 */

public class ExcetionTypes {

	public static void main(String[] args) throws IOException{
		/**
		 * ----> Default throw and default catch
		 * ----> Default throw and our catch
		 */
		try {
			//After try block there should be at least a catch block or finally block
			
			//It is important to know that try block will stop the code on the statement that
			//has exception. Hence, put as minimal code as possible on try block
		}catch(NullPointerException e) { //Outer Exception Objects
			//Multiple catch can be implemented for different error catching
		}
		catch(ArithmeticException e) {
			
		}
		finally {
				//Code to run after the catch
			//Finally code runs whether there is exception or not
			// Java default catch mechanicism only runs after finally runs
		}
		/**
		 * ----> Our throw and default catch
		 * ----> Our throw and our catch
		 * Example:
		 */
		
		int balance=5000;
		int withdrawlAmount=6000;
		if(balance<withdrawlAmount) {
			throw new ArithmeticException("Insufficient Balance"); //Our throw and default catch
		}
		
		
		try {
			if(balance<withdrawlAmount) {
				throw new ArithmeticException("Insufficient Balance"); //Our throw and our catch
			}	
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Hello World!");
		}
		
		
		
		
		

	}

}
