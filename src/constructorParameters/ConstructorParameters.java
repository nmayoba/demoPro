package constructorParameters;

public class ConstructorParameters {
	int  x;
	String constructorName;
	
	//Create a constructor
	public ConstructorParameters(int y, String myName) {
		x = y;
		constructorName = myName;
		
	}
	public static void main (String[]args) {
	//TODO Auto-generated method stub	
	ConstructorParameters myobject = new ConstructorParameters(6,"Precious");
	System.out.println(myobject.x +" " + myobject.constructorName);
	}
}
