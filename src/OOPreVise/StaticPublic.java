package OOPreVise;

public class StaticPublic {
	//create a static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creationg an objects");
	}
	
	//create a public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call the static method 
		myStaticMethod();
		
		//create an object of the new method
		StaticPublic myObj = new StaticPublic();
		//call the public method of the object
		myObj.myPublicMethod();
		
	}

}
