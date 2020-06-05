package threads;
/**
 * --> In Java we can specify the priority of each thread relative to other threads
 * --> Those threads having higher priority get greater access to available resources
 * 	   then lower priority threads
 * --> A Java thread inherits its priority from the thread that created it
 * @Default_priority_value_is_5
 * --> You can modify a thread's priority at any time after its creation using
 * 	   the setPriority() method and retrieve the thread priority value using getPriority() method.
 * 
 * --> The following static final integer constants are defined in the Thread Class:
 * 		# MIN_PRIORITY (1) Lowest Priority
 * 		# NORM_PRIORITY (5) Default Priority
 * 		# MAX_PRIORITY (10) Highest Priority
 * 
 * @author suraj
 *
 */

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread();
		t1.setPriority(Thread.MIN_PRIORITY); //Setting the least priority for a thread.. Can also be an int
		//These priorities final values are present on the Thread class themselves
		System.out.println(t1.getPriority()); //prints: 5 (default priority value)

	}

}
