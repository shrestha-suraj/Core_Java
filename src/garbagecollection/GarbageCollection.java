package garbagecollection;
/**
 * new Stundet();
 * Objects scope and lifetime is not determined by compiler
 *
 * Student s=new Student();
 * 
 * Reference varilable lifetime i.e. (s) lifetime is determined by compiler
 * 
 *Static memory location
 *Dynamic memory location
 *
 *--> In Java destruction of object from memory is done automatically by the JVM.
 *--> No delete keyword in Java
 *--> When there is no reference to an object then that object is assumed to be no
 *	  longer needed and the memory occupied by the object are released
 *--> This technique is called Garbage Collection.
 *--> This is accomplished by the JVM.
 *
 *--> Whenever you run a java program, JVM creates three threads.
 *		$ main thread
 *		$ Thread Scheduler
 *		$ Garbage Collector Thread
 *
 *--> In these three threads, main thread is a user thread and remaining two are
 *	  daemon threads that run in background.
 *
 *--> Abandoned objects or dead objects are those objects which does not have live
 *	  references.
 *
 *--> Garbage collector thread before sweeping out an abondoned object, it calls
 *	  finalize() method of that object.
 *--> After finalize() method is executed, object is destroyed from the memory.
 *
 *# We can create finalize() method in our classes. This method runs when the garbage object
 *	is made to be destoryed and release its memory.
 *
 *--> We can call garbage collectory explicitly using System.gc() or RunTime.getRunTime().gc()
 *--> But, it is just a request to garbage collector not a command.
 *--> It is up to the garbage collector to honor this request
 *# This starts the garbage collector to free unused memory. but this is request and is not
 *	garunteed that the gc will run.
 *	
 *
 * @author suraj
 *
 */

public class GarbageCollection {

	public static void main(String[] args) {
	}

}
