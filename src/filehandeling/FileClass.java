package filehandeling;
import java.io.File;
import java.io.IOException;
/**
 * File Class is an abstract representation of a file and directory pathnames
 * Stores metadata of the file that is being accessed using File Object
 * @author suraj
 *
 */

public class FileClass {

	public static void main(String[] args){
//		File file=new File("g:/JavaProgramis/name1.txt"); //Path of the file
		File file=new File("test.txt");
		System.out.println("Can file Read: "+file.canWrite()); //returns boolean
		System.out.println("Is file exist: "+file.exists()); //returns boolean
		System.out.println("File name: "+file.getName()); //returns filename
		System.out.println("Length of file: "+file.length()); //returns size of file in bytes 
		
		//Creating a new file that does not exists
		try {
			System.out.println("File is being created.");
			File file1=new File("test1.txt");
			System.out.println(file1.createNewFile()); //Returns boolean true if file created, false if file exists
		}catch(IOException e) {
			System.out.println("File aready exists.");
		}
		
		file.delete(); //This code deletes the file  

		/*
		 * Atomically creates a new, empty file named by this abstract pathname if and only if
		 * a file with this name does not yet exist
		 */
	}

}
