package garbagecollection;
/**
 * -->  An object is created in the memory using new operator. Constructor is used to
 * 		initiaize the properties of that object.
 * -->	When an object is no more required, it must be removed from the memory so that
 * 		the memory can be reused for other objects.
 * 
 * -->	finalize() method is a protected and non-static method of java.lang.Object class.
 * 
 * 		protected void finalize() throws Throwable{
 * 			//code here
 * 		}
 * 
 * --> Exceptions occured in finalize() method are not propagated. They are ignored by
 * 	   the garbage collector
 * --> finalize() methods are not chained like constructors i.e. there is no calling statement
 * 	   to super class finalize() method inside the finalize() method of sub class. Your need to
 * 	   explicitly call super class finalize() method.
 * 
 * 
 * @author suraj
 *
 */
public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				garbageTest();
				//System.gc()
				//RunTime.getRunTime().gc()
				System.gc();
			}
			public static void garbageTest() {
				Test t1=new Test();
			}

}
class Test{
	protected void finalize() throws Throwable {
		System.out.println("Hello World");
	}
}
	
