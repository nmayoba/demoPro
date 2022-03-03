package FirstPakage;

public class Methodsdemo3 {

	public static void demoingMethodOneString(String fName) {
		//code to be executed
		System.out.println(fName + " is the first name");
		
	}
	static void demoingMethodZeroParams() {
		//code to be executed
		System.out.println("This method doesn't expect any parameters");
		
	}
	
	static void demoingMethodNameAge(String fName, int iAge) {
		//code to be executed
		System.out.println(fName + " is the first name" + " and " + iAge + " is the age");
	}
	
	static void demoingMethodNameFriend(String fName, String fFriend) {
		//code to be executed
		System.out.println(fName + " is the first name" + " and " + fFriend + " is the friend's name");
	}
	static int returnInt(int x) {
		System.out.println("this inside the returnInt method" + "and this is the pram value for x " + x);	
		return 6*4;
		
	}
				
				public static void main(String[]arg) {
					//TODO Auto-generated method stub
					System.out.println("This is the Main Method");
				    demoingMethodOneString("Precious");
				    demoingMethodOneString("Wessels");
				    demoingMethodOneString("Diana");
				    demoingMethodOneString("Luan");
				    demoingMethodOneString("Priven");
					demoingMethodNameFriend("Antonette","Wessel");
					demoingMethodNameAge("Antonette",33);
					demoingMethodZeroParams();
					demoingMethodZeroParams();
				    //System.out.println(returnInt(99);
					int returnValue = returnInt(99);
					System.out.println(returnValue + "is the return value");
					
					
					
	}

}
