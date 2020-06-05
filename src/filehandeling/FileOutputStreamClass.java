package filehandeling;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream is meant for writing streams of raw bytes
 * FileOutputStream is subclass of OutputStream
 * @Constructors_Of_FileOutputStream
 * --> FileOutputStream(File file)
 * 	# Creates a file output stream to write to the file represented
 * 	  by the specified File object by creating new file. Overwrites
 * 
 * --> FileOutputStream(File file, boolean append)
 * 	# Creates a file output stream to write to the file represented
 * 	  by the specidifed File object but appends on file
 * 
 * --> FileOutputStream(String name)
 *  # Creates a file output stream to write to the file with the specified
 *    name
 *    
 * --> FileOutputStream(String name, boolean append)
 * 	# Creates a file output stream to write to the file with the specified name.
 * 
 * 
 * @author suraj
 *
 */

public class FileOutputStreamClass {

	public static void main(String[] args) throws IOException {
		int i;
		FileOutputStream fout;
		fout=new FileOutputStream("./test.txt",true);
		String s="TATA";
		//Converting the data into character stream
		char charArray[]=s.toCharArray(); //this method is responsible for converting data into char stream sequence
		
		//Converting the data into byte stream
		byte data[]=s.getBytes(); //this method is responsible for converting data into byte strean sequence
		
		for (i=0;i<s.length();i++) {
			fout.write(data[i]);
			fout.write(charArray[i]);
		}
		fout.close();

	}

}
