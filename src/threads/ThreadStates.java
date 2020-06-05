package threads;
/**
 * A Java thread is always in one of several states which could be
 * running, sleeping, dead, etc
 * 
 * STATES:
 * -> new thread (When threads are created but does not start running)
 * 		# You can call only the start() or stop() methods when the thread is in this state.
 * 		# Calling any other method besides start() or stop() causes an IllegalThreadStateExcetion.
 * 			(A descendant class of RuntimeException)
 * 
 * -> runnable (When thread starts to run in parallel)
 *		# This state is reached by invoking the start() method which invokes the run() method.
 *		# A Runnable thread may actually by running, or may be awaiting its turn to run
 *
 * -> not runnable (When thread execution is paused) Example: User input from keyboard.next()
 * 		#Four events can cause this state:
 * 			---> When sleep(Argument in milliseconds) method is invoked and it sleeps for a specified amount of time
 * 			---> When suspend() method is invoked. @depreciated -->Can be resumed using resume() method
 * 			---> When the wait() method is invoked and the thread waits for notification of a
 * 				 free resource or waits for the completion of another thread or waits to acquire
 * 				 a lock of an object --> If thread is waiting on a condition variable, whatever object owns the
 * 										variable must relinquish it by calling either notify() or notifyAll().
 * 			---> The thread is blocking on I/O and waits for its completion. (Example User input)
 * -> dead (When thread execution is finished or exception occurred that is not handled. 
 * 			Thread cannot come back from dead state. Dead state can also be invoked by stop() method)
 * 		#
 * 
 * 
 * 
 * 
 * @author suraj
 *
 */
public class ThreadStates {

}
