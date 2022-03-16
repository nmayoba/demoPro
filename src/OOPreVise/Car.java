package OOPreVise;

public class Car extends Vehicle {
	String modelName = "Mustang";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a myCar object
		Car myCar = new Car();
		
		//call the honk method on the vehicle class on the myCar object
		myCar.honk();
		System.out.println(myCar.brand + " " + myCar.modelName);
	}

}
