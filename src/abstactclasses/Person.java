package abstactclasses;

public abstract class Person {
	String name;
	
	public Person(String myName) {
		name=myName;
	}
	
	abstract void show();
	
	public String getName() {
		return name;
	}

}
