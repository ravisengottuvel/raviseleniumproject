package Seltraining;

public class Returnclass {

	String firstname = "ravi";
	String secondname = "sengottuvel";
	String salution = "Mr";  // Instance variable 
	public String display(){
		String name = firstname + secondname ; 
		return name;
	}
	
	public static void main(String[] args) {  // Main Method
		
		Returnclass dis = new Returnclass();    // Object
		String name= dis.display(); 
		String fin = name + dis.salution;
		System.out.print(fin);
		
		
		// TODO Auto-generated method stub

	}

}
