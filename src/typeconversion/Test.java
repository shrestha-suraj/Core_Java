package typeconversion;

public class Test {

	public static void main(String[] args) {
		Hello h1=new Hello();
		h1.printName();
	}

}

class Hello{
	private String x;
	public void printName() {
		System.out.println(x);
	}
	public String toString() {
		return "Nepal";
	}
}
