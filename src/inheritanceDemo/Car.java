package inheritanceDemo;

public class Car extends Vehicle {
private String modelName = "Mustgang";

	
public static void main(String[]args) {
	//TODO Auto-generated method stub
	
	//create an object of the car class
	Car myCar = new Car();
	
	//call the honk method (from the vehicle class)on the my Car object
	myCar.honk();
	
	//Display the value of the attribute (from the Vehicle class)and the value of the modelName from the carClass
	System.out.println(myCar.brand +" " + myCar.modelName);
	
	
	
}
}

