package nestedclass;
/**
 * -->  Anonymous classes in Java are more accurately known as anonymous inner classes
 * -->  There is no such thing as anonymous classes without the "inner"
 * -->  They are defined inside another class
 * -->	An anonymous inner class is an inner class that is declared witout using
 * 		a class name
 * 
 * 
 * @author suraj
 *
 */

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass2 outer=new OuterClass2();
		outer.g.sayHello(); //Prints "Nepal"
		//This is so awsome

	}

}
class OuterClass3{
	public void sayHello() {
		System.out.println("Hello");
	}
}

class OuterClass2{
	//Anonymous class: creating object during class Decleration
	//This anonymous class is anonymous class of OuterClass3 not OuterClass2 (tricky)
	//go to main class from here
	OuterClass3 g=new OuterClass3(){
		@Override
		public void sayHello() {
			System.out.println("Nepal");
		}
	};
}




