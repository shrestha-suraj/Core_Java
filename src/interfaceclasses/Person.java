package interfaceclasses;

/**
 * In interface,
 * the variables are public static and final
 * interface does not have constructor
 * Usually interface provides prototype functions but not variables
 * 
 * Note: Interfaces can extends other interface to group the function prototyes
 * 
 * Classes can extend one Class but implements multiple interfaces
 * 
 * When we create reference variable for a object decleration then it can only use
 * methods of that interface
 * 
 * example:
 * I1 test=new Student();
 * test can only access the methods that are sketched on the I1 interface
 * 
 * @author suraj
 *
 */
public interface Person {
	String name="Suraj";
	void setName();
	void setAge();
}
