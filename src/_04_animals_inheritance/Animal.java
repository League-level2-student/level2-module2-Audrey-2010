package _04_animals_inheritance;

public class Animal {
	String name;
	String furcolor;
	boolean isgirl;
	
	public void play() {
		System.out.println("Playing");
	}
	
	public void eat() {
		System.out.println("Eating");
	
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	public void printName(String name) {
		System.out.println("My name is "+name);
	}
}
