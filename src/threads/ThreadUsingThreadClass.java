package threads;

/**
 * There are two ways to create thread in java;
 * -> Implement the Runnable interface (java.lang.Runnable)
 * -> By Extending the Thread Class (java.lang.Thread)
 * @author suraj
 * 
 *  # Here we will work on extending the thread class
 *  
 *  When a class extends Thread Class the object of that particular
 *  class becomes thread and hence can override run method and call 
 *  thread.start() function as well.
 *  
 *  The only drawback of this way is that if you make Thread as superclass of a class then
 *  you cannot have other class as superclass. This is only one drawback in this case.
 */

public class ThreadUsingThreadClass{
	
	public static void main(String[] args) {
		A1 thread1=new A1();  //The objects themselves are threads
		B1 thread2=new B1();
		thread1.start();
		thread2.start();
	}
}

class A1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread A: "+i);
		}
		
	}
}
class B1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread B: "+i);
		}
		
	}
}
