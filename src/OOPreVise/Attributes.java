package OOPreVise;

public class Attributes {
	int x =66;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attributes myAtt = new Attributes();
		System.out.println(myAtt.x);
		myAtt.x =45; 
		System.out.println(myAtt.x);
		
		Attributes myAtt2 = new Attributes();
		myAtt2.x =77;
		System.out.println(myAtt2.x);
		System.out.println(myAtt.x);
	}

}
