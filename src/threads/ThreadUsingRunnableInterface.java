package threads;
/**
 * There are two ways to create thread in java;
 * -> Implement the Runnable interface (java.lang.Runnable)
 * -> By Extending the Thread Class (java.lang.Thread)
 * @author suraj
 *
 * In this class we will work on thread with runnable interface
 *  STEPS:
 *  # CREATE THREAD
 *  # ATTACH CODE TO THE THREAD
 *  # EXECUTE THREAD
 *  
 *  
 *  An object of Thread class is created by passing a Runnable object as argument to
 *  the Thread constructor. The Thread object now has a Runnable object theat implements
 *  the run() method.
 *  
 *  The start() method is invoked on the Thread object created in the previous step. The
 *  start() method returns immediately after a thread has been spawned.
 *  
 *  The thread ends when the run() method ends, either by normal completion or by throwing an
 *  uncaught exception
 */

public class ThreadUsingRunnableInterface {
	
	public static void main (String[] args) {
		/**
		 * Create a class (Let it be A) with a function and want to attach that function with the thread t1 
		 * Class should implement Runnable Interface that has one function called run() which needs to be initialized
		 * 
		 * Then,   Runnable r1=new A();
		 * 			Thread t1=new Thread(r1); //Thread only takes in Runnable object as argument
		 * 										this allows Thread to call only run function defined in the interface
		 * 			t1.start();
		 * 			This executes the run function to run our code
		 * 			
		 * 			Similar concept to t2 and hence we have multi-threading
		 * 
		 * 
		 */
		
		//EXAMPLE
		A test=new A();
		Runnable test1=new A();
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();
		//The output does not depend on same pattern.
		//This makes the code look like running parallels.
		/**
		 *  Thread A 0
			Thread B 0
			Thread B 1
			Thread A 1
			Thread B 2
			Thread A 2
			Thread B 3
			Thread A 3
			Thread B 4
			Thread A 4
			Thread B 5
			Thread A 5
			Thread B 6
			Thread B 7
			Thread B 8
			Thread B 9
			Thread A 6
			Thread A 7
			Thread B 10
			Thread A 8
			Thread A 9
			Thread A 10
		 */
		
	}
}

class A implements Runnable{

	@Override
	public void run() {
		int i;
		for (i=0;i<=10;i++) {
			System.out.println("Thread A "+i);
		}
	}
	
}

class B implements Runnable{

	@Override
	public void run() {
		int i;
		for (i=0;i<=10;i++) {
			System.out.println("Thread B "+i);
		}
	}
	
}
