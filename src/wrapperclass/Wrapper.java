package wrapperclass;

public class Wrapper {

	public static void main(String[] args) {
		//Integer Wrapper Class
		Integer i1=Integer.valueOf("1f",16); //Value and base for hex
		System.out.print(i1); //Prints 31 for decimal base
		int a= Integer.parseInt("123"); //Converts a String data type to int
		
		int c=i1.intValue(); //converts objects into premitive as well
	}

}

