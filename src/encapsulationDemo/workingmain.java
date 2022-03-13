package encapsulationDemo;

public class workingmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person myObj = new Person();
		
		//Set the value of the name value to Precious 
		myObj.setname("Precious");
		
		System.out.println(myObj.getname());
}
}


//Summary
//Why do we need Encapsulation?

//Better control of class attributes and methods (Luan 's words better structure of our program)
//Increase security of data
//Class attributes can be made read-only (if you only use the get method)
//or write-only (if you only use the set method)
