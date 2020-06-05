package keyboardinput;

import java.util.Scanner;

/**
 * Anything entered in keyboard first goes to buffer
 * Buffer is like an long array
 * System.in represents thing that is responsible for bringing data to buffer (ususally its keyboard)
 * Note: Scanner keyboard=new Scanner(System.in);
 * 
 * Scanner has a function called nextInt that is responsible to pickup data from the 
 * buffer and then return it to the program variable that is calling the method
 * 
 * Say there is no data in buffer for nextInt, then scanner stops the program until user
 * clicks a button in the keyboard which is then sent to buffer to be read by scanner
 * 
 * enter, space is called delimiter that is an ending mark for fetching data from buffer
 *
 * @author suraj
 *
 */

public class KeyboardInput {

	public static void main(String[] args) {
		Scanner keybaord=new Scanner(System.in);
		/**
		 * System.in is the object that is referenced to keyboard
		 * If we are bringing data to buffer from a different source
		 * we will change System.in to different thing example like a file
		 */
		

	}

}
