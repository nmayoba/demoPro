package Cat;

public class Cats {
	private static final String Luna = null;
	String breed;
	int weight;
	//Create a static method
	static void myMethod() {
		System.out.println("Beautiful cats");
	}
	//unlike public, which can be accessed by objects
	public void meowing() {
        System.out.println("Is crying");
	}
	
	public void jump() {
        System.out.println("Cat is jumping");
        
	}
	
	public void sleep() {
        System.out.println("Cat is sleeping");
	}
	
	public static void main(String[] args) {
	//Create an instance of the Fist Class
	myMethod();
	Cats Sisi = new Cats();
	Sisi.breed = "Persian Cat";
	Sisi.weight = 24;
	Sisi.jump();
	Sisi.sleep();
	
	myMethod();
	Cats Luna = new Cats();
	Luna.breed = "Burmese";
	Luna.
	
	
	}
}
	