package oopRevised;

public class Revised {
	int x;
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		Revised rv = new Revised();
		rv.x = 40;
		System.out.println(rv.x);
		
		//create another instance with a different value for x
		Revised rv2 = new Revised();
		rv2.x = 16;
		System.out.println(rv2.x);

}
}