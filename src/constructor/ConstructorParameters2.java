package constructor;

public class ConstructorParameters2 {
	int modelYear;
	String modelName;
	
	public ConstructorParameters2(int year, String name) {
		modelYear = year;
		modelName = name;
		
	}
	public static void main(String[]args ) {
	//TODO Auto-generated method stub
		
	//call the constructor by creating a object of the class
	ConstructorParameters2 myCar = new ConstructorParameters2(1969,"Mustang");
	System.out.println(myCar.modelYear + " " + myCar.modelName);

	}

}
