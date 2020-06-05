package filehandeling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * --> Writing data to file means storing data in the file.
 * 
 *  # Buffering means storing all the byters in buffer memory location
 *    and writing it whole in the file.  
 *  # The byte stream doesnot uses buffer and writes one character at at time.
 *  
 * --> BufferedWriter writes text to a character-output stream,
 *	   buffering characters so as to provide for the efficient writing
 *	   of single characters, arrays, and strings
 * --> The buffer size may be specified, or the default size
 * 	   may be accpeted. The default is large enough for most purposes.
 * 
 * --> @Constructors
 * 
 * --> BufferedWriter(Writer out)
 * 		$ Creates a buffered character-output stream that uses a default-sized output buffer.
 * --> BufferedWriter(Writer out, int size)
 * 		$ Creates a new buffered character-output stream that uses an ouput buffer of the given size.
 * 
 * @author suraj
 *
 */
public class BufferedWriterClass {

	public static void main(String[] args) throws IOException {
		
		//FileWriter is subclass of Writer .Wrtier class is abstract class
		BufferedWriter bf=new BufferedWriter(new FileWriter("./test.txt",true));
		bf.write("Hello World\n");
		bf.close();
		

	}

}
