package staticvariable;

public class UnderstandingStatic {

	public static void main(String[] args) {
		System.out.println(Box.count);
		Box b1=new Box();
		Box b2=new Box();
		Box b3=new Box();
		Box b4=new Box();
		Box b5=new Box();
		b5.count=1;
		/**
		 * All objects can still call the static variable and change it if needed
		 * If you don't want objects to access the static variables
		 * we need to make it private and use a static method to access it.
		 * Create only getters not setters
		 */
		System.out.println(Box.count);
	}

}

class Box{
	private int length,width,height;
	static int count;
	
	public Box() {
		this.length=0;
		this.width=0;
		this.height=0;
		count++;
	}

}
