package Vehicle;

public class Vehicle {
	String Brand = "Volvo";
	
	public String Hoot() {
		return "Hoot, hoot";
	}
	
	public String PowerSteering(boolean powersteering) {
		if(powersteering == true) {
			return "This vehicle has power steering.";
		} else {
			return "This vehicle does not have power steering.";
		}
	}
}

