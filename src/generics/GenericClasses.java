package generics;

public class GenericClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClassExample stringData=new GenericClassExample(new String("Suraj"));
		System.out.println(stringData.getValue());
		GenericClassExample numberData=new GenericClassExample(Integer.valueOf(12345));
		System.out.println(numberData.getValue());
	}

}

//Can be more parameters if needed <E1,E2,E3..> and so on.
class GenericClassExample<E>{
	E value;
	
	public GenericClassExample(E value) {
		this.value=value;
	}
	
	public E getValue() {
		return value;
	}
	
}
