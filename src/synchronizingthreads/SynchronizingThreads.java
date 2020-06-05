package synchronizingthreads;

import java.util.Scanner;

/**
 *-> When we start two or more threads within a program, there may be a situation when
 *	 multiple threads try to access the same resource
 *-> So there is a need to synchronize the action of multiple threads and make sure that
 *	 only one thread can access the resource at a given point in time.
 *
 *
 *@Example_Of_Synchronizing_Need
 *
 *Joint account (2 people) $1000
 *Person 1 uses thread 1 to take $600
 *Person 2 uses thread 2 to take $700
 *
 *If not synchronized, the balance becomes -300$ which is not possible
 *
 *
 * @author suraj
 *
 */

public class SynchronizingThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(1000);
		Thread t1=new Thread(new Customer(account,"Suraj"));
		Thread t2=new Thread(new Customer(account,"Ramesh"));
		t1.start();
		t2.start();

	}
}

class Account{
	private int balance;
	public Account(int bal) {
		this.balance=bal;
	}
	public boolean isSufficientBalance(int withdrawlAmount) {
		if(balance>withdrawlAmount) {
			return true;
		}
		return false;
	}
	public void withdraw(int amount) {
		balance=balance-amount;
		System.out.println("Withdrawl money is "+amount);
		System.out.println("Your current balance is "+balance);
	}
}

class Customer implements Runnable{
	private Account account;
	private String name;
	public Customer(Account account,String name) {
		this.account=account;
		this.name=name;
	}
	@Override
	public void run() {
		Scanner keyboard=new Scanner(System.in);
		int amt=keyboard.nextInt();
		System.out.println("Enter amount to withdraw ("+name+"): ");
		synchronized(account) { //When acocunt object is accessed by a thread other thread will not be able to access it
			if(account.isSufficientBalance(amt)) { //As account is the shared resource in the threads
				account.withdraw(amt);
			}else {
				System.out.println("Insufficient Balance.");
			}
			
			/**
			 * All the code present in the synchronize block is only ran by a single thread at a time.
			 * Shared resource should hbe handled by one thread at a time
			 * -> Java programming language provides a very handy way of creating threads and synchronizing
			 *	  their task by using synchronized blocks.
			 * -> You keep shared resouces within this block.
			 * 
			 *   	synchronized(objectidentifier){
			 *   		//Access shared variables and other shared resources
			 *   	}
			 */
		}
	}
}
