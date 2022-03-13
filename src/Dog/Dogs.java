package Dog;

import Car.Cars;

public class Dogs {
	String colour;
	String fur;
	//Create a static method
	static void myMethod() {
		System.out.println("Beautiful dogs");
	}
	//unlike public, which can be accessed by objects
	public void bark() {
        System.out.println("Dog is barking");
	}
	
	public void eat() {
        System.out.println("Dog is eating");
        
	}
	
	public void play() {
        System.out.println("Likes to play");
	}
	
	public static void main(String[] args) {
	//Create an instance of the Fist Class
	myMethod();
	Dogs Rodger = new Dogs();
	Rodger.colour = "Brown";
	Rodger.fur = "Smooth";
	Rodger.bark();
	Rodger.play();
	
	myMethod();
	Dogs Benji = new Dogs();
	Benji.colour = "White";
	Benji.fur = "Is turning yellow";
	Rodger.bark();
	Rodger.play();
	
	}
}
	