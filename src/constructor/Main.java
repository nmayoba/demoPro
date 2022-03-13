package constructor;

public class Main {
	//Create a class attribute
	int x;
	
	//create a class constructor for the Main class
	public Main() {
		//set the initial value for the class attribute x
		x = 5;
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		
		//create an object of class Main (This will call the constructor)
		Main myObj = new Main ();
		
		////print the value of x
		System.out.println(myObj.x);
		
	}
}
