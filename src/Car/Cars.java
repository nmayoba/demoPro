package Car;


public class Cars {
		String colour;
		int speed;
		//Create a static method
		static void myMethod() {
			System.out.println("Greetings");
		}
		//unlike public, which can be accessed by objects
		public void drive() {
	        System.out.println("Car is driving");
		}
			
		public void breaks() {
			System.out.println("Car breakes");
								
		}
		
		public static void main(String[] args) {
				//Create an instance of the Fist Class
			myMethod();
			Cars Polo = new Cars();
			Polo.colour = "White";
			Polo.speed = 160;
			Polo.breaks();
			Polo.drive() ; 
			
			myMethod();
			Cars Tcross = new Cars();
			Tcross.colour = "Red";
			Tcross.speed = 240;		
			Tcross.breaks();
			Tcross.drive();
			
			
				
			}
	}


