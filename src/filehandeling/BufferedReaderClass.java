package filehandeling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * -->  Reading data from a file means extracting data stored in the file
 * 	    (without deleting it from the file).
 * 
 * -->  Reads text from a character-input stream, buffering characters so as
 * 	    to provide for the efficient reading of characters, arrays and lines
 * -->	The buffer size may be specified, or the default size may be used.
 * 
 * #	Reads all data or buffered sized data at one time and stores it in 
 * 		Buffer in RAM and the object is poiting at this buffer to get as much data as needed.
 * 
 * @Constructor
 * 
 * -->	BufferedReader(Reader input)
 * 		$ Creates a buffering character-input stream that uses a default-sized input buffer
 * --> BufferedReader(Reader input,int size)
 * 		$ Creates a buffering character-input stream that uses an input buffer of the specified size.
 * 
 * @author suraj
 *
 */
public class BufferedReaderClass {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("./test.txt");
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		System.out.println(data);//Will return data
		String data1=br.readLine();
		System.out.println(data1); //Will return null
		br.close();
		
		//This will read one line at a time (need to use loop for whole file until returned null)
		//There are other methods that can be used with BufferedReader. Check them out
		
		//br.read(char[] cbuf, int off, int len)
		//-> Reads charactes into a portion of an array
		
//		BufferedReader bf1=new BufferedReader(fr);
//		char[] s=new char[20];
//		bf1.read(s,2,5);
//		System.out.println(s);
//		bf1.close();
//		System.out.println("This is outside the file");
//		
	}

}
