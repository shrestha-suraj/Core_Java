package nestedclass;
/**
 * -->  In Java, just like methods, variables of a class too can have another class
 * 		as it s member.
 * -->  The class written within is called the nested class.
 * -->  The class that holds the inner class is called the outer class.
 * -->  Types of Inner Class: static inner class and non-static inner class.
 * -->  Static inner class instance can be created outside the outer class
 * 		with the following syntax:  Outer.Inner obj=new Outer.Inner();
 * -->	No need to create the instance of Outer Class.
 * 
 * 		$ static nested class can be create object outside the outer class
 * 		$ non-static nested class object cannot be created without creating object of outer class.
 * @author suraj
 *
 */
public class NestedClass {
	//Outer Class

	public static void main(String[] args) {
		//This is how to create the object of static inner class of an outer class
		//Static inner class doesnot have access to the instance variables of outer class
		//Static inner class does have access ot the static members of outer class
		OuterClass.InnerClassStatic innerClassStatic=new OuterClass.InnerClassStatic();
		innerClassStatic.if1();
		
		//Creating object of non-static nested class
		//Since inner class is not static it can access the variable of outer class
		//Since inner class is not static it can still access the varibale of outer class
		OuterClass outer=new OuterClass();
		OuterClass.InnerClassNonStatic innerClassNonStatic=outer.new InnerClassNonStatic();
		innerClassNonStatic.if2();
	}
	
	

}

class OuterClass{
		
	int x=10;
	//Inner class can be public, private, protected, or default
	
	
	static class InnerClassStatic{
		//Nested or Inner Class or inner class
		
		void if1() {
			System.out.println("if1()");
		}
	}
	class InnerClassNonStatic{
		//Nested or Inner Class or inner class
		
		void if2() {
			System.out.println("Value of x is: "+x);
		}
	}
	
}
