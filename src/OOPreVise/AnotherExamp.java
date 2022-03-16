package OOPreVise;

public class AnotherExamp {
	int modelYear;
	String modelName;
	
	//create a constructor
	public AnotherExamp(int year1, String name1) {
		modelYear = year1;
		modelName = name1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnotherExamp myAnEx = new AnotherExamp(1944, "Mustang");
		System.out.println(myAnEx.modelYear + " " + myAnEx.modelName);
	}

}
