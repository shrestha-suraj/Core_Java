package filehandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * --> Reading data from file means extracting data stored in the file
 *    (without deleting it from the file.)
 * 
 * --> FileInputStream is meant for reading streams of raw bytes
 * --> FileInoutStream obtains input bytes from a file in a file system.
 * @Constructors_Of_FileInputStream
 * --> FileInputStream(File file)
 * 	# Creates a FileInputStream by opeing a connection to an actual file.
 * 	  the file named by the File object file in the file system
 *
 * --> FileInputStream(String name)
 *  # Creates a FileInputStream by opening a conection to an actual file,
 *    the file named by the path name name in the file system.
 * 
 * @author suraj
 *
 */

public class FileInputStreamClass {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("./test.txt");
		byte data[]=fin.readAllBytes();
		//Also we can use int x=fin.read(); which returns each byte in int format
		//Recommended to use if you want to allow UTF-16 format character printing
		//Whe i=-1, it is the end of file
		for(int i=0;i<data.length;i++) {
			System.out.print((char) data[i]);
		}
		//using read with int
		FileInputStream fin1=new FileInputStream("./test.txt");
		int i;
		do {
			i=fin1.read();
			if(i!=-1)
				System.out.print((char) i);
		}while(i!=-1);
		
		fin.close();
		fin1.close();

	}

}
