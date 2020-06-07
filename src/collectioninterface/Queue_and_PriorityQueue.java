package collectioninterface;

import java.util.PriorityQueue;

/**
 * <QueueInterface>
 * -->  Child interce of Collection
 * -->	Null values are not allowed
 * -->	Duplicate values are allowed
 * -->	Heterogenous elements are allowed
 * -->	The Queue interface basically orders the elements in FIFO (First In First Out) manner
 * 
 * -->  @Methods_In_Queue
 * 		$ boolean offer(E e)  //
 * 		$ E poll()			  // Returns special value (null or false)
 * 		$ E peek()			  //
 * 		
 * 		The methods above and below both perform same task
 * 		Like: offer is same as add poll is same as remove and peek is same as element
 * 		The only difference is how they response to the result
 * 
 * 		$ boolean add(E e)      // 
 * 		$ E remove()		    // Throws exception on fail
 * 		$ E element()			//
 * 
 * <PriorityQueue>
 * 
 * -->  Implementation class of Queue
 * -->	The elements of the priority queue are ordered according to their natural ordering,
 * 		or by a Comparator provided at queue construction time.
 * -->	Null is not allowed
 * -->	Not thread safe
 * -->	Use PriorityBlockingQueue for thread safe
 * 
 * -->  @Constructors
 * 		$ PriorityQueue()
 * 		$ PriorityQueue(Collection c)
 * 		$ PriorityQueue(int initialCapacity)
 * 		$ PriorityQueue(int initialCapacity,Comparator c)
 * 		$ PriorityQueue (SortedSet s)
 * 		$ PriorityQueue (PriorityQueue p)
 * 
 * @author suraj
 *
 */
public class Queue_and_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue q=new PriorityQueue();
		q.offer("A");   
		q.offer("C");
		q.offer("D");
		q.offer("B");
		System.out.println(q.poll()); //Removes in natural ordering  //Returns A
		System.out.println(q.poll()); //Returns B
		System.out.println(q.poll()); //Returns C
		System.out.println(q.poll()); //Returns D

	}

}
