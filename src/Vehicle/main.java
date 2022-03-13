package Vehicle;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VolvoClassicCar oldCar = new VolvoClassicCar();
		
		System.out.println(oldCar.Brand);
		System.out.println(oldCar.Hoot());
		System.out.println(oldCar.PowerSteering(false));
		System.out.println(oldCar.Wheels);
		System.out.println(oldCar.Colour);
		
		System.out.println("-----------");
		
		VolvoNewCar newCar = new VolvoNewCar();
		
		System.out.println(newCar.Brand);
		System.out.println(newCar.Hoot());
		System.out.println(newCar.PowerSteering(true));
		System.out.println(newCar.Wheels);
		System.out.println(newCar.Colour);
		
		System.out.println("-----------");
		
		VolvoClassicBus oldBus = new VolvoClassicBus();
		
		System.out.println(oldBus.Brand);
		System.out.println(oldBus.Hoot());
		System.out.println(oldBus.PowerSteering(false));
		System.out.println(oldBus.Wheels);
		System.out.println(oldBus.Colour);
		
		System.out.println("-----------");
		
		VolvoNewBus newBus = new VolvoNewBus();
		
		System.out.println(newBus.Brand);
		System.out.println(newBus.Hoot());
		System.out.println(newBus.PowerSteering(true));
		System.out.println(newBus.Wheels);
		System.out.println(newBus.Colour);
	}
}
