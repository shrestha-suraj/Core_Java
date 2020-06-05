package filehandeling;
/**
 * # Life of variable is always shorter than life of program
 * So to prevent data loss when variable life ends, data needs to be saved in file
 * -> The java.io package contains nearly every class you might ever need to perform input
 * 	  and output (I/O) in Java.
 * -> All these streams represent an input source and an output destination
 * -> Java provides strong but flexible support for I/O related to Files.
 * 
 * -> File handling is an integral part of nearly all programming projects
 * -> Files provide the means by which a program stores data
 * 
 * ->STREAMS represents a Source (which generates the data in the form of Stream)
 * 	 and a destination(which consumes or read data available as Stream)
 *  # Data coming from a file- InputStream
 *  # Data going to a file- OutputStream
 *  
 *  -> Modern version of Java define two types of streams: byte and character
 *  -> Byte streams provide a convenient means for handling input and output of bytes. (Example: 100101010101)
 *  -> Character streams are designed for handling the input and output of character. (Example: 10101010-> becomes 1 character)
 *  	# Character stream is derived form of byte stream that uses byte stream internally but outputs characters
 *  
 *  --> Byte stream classes: BufferedInputStream/ BufferedOutputStream
 *  				  		 ByteArrayInputStream/ ByteArrayOutputStream
 *  				  		 DataInputStream/ DataOutputStream
 *  				  		 FileInputStream/ FileOutputStream
 *  				  		 PrintStream  & RandomAccessFile
 *  --> Character stream classes: BufferedReader/ BufferedWriter
 *  							  CharArrayReader/ CharArrayWriter
 *  							  FileReader/ FileWriter
 *  							  InputStreamReader/ OutputStreamWriter
 *  							  PrintWriter
 *  							  StringReader/ StringWriter
 * 	
 * @author suraj
 * 
 *
 */

public class Introduction {

	public static void main(String[] args) {
		

	}

}
