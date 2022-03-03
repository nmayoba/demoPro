package FirstPakage;

public class TwoParamMethod {
		
	// This method returns the sum of the method's 2 parameters
	static int myMethod(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int returnValue =myMethod(5, 8);
		System.out.println("the return value is " + returnValue);
		System.out.println("the sum of 12 and 9 is " + myMethod(12, 9));
			
		
	}

}
