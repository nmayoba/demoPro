package OOPreVise;

public class ConstructorParam {
	int x;
	
	//create a constructor
	public ConstructorParam(int y) {
		x = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParam myConParm = new ConstructorParam(67);
		System.out.println(myConParm.x);
		
	}

}
