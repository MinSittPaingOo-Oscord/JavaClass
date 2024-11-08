package OOP;

class School{
	
	int x = 90;
	
	void write() {
		System.out.println("The value of x is " + x);
	}
	
}

public class OOP1 {

	public static void main(String[] args) {
		
		School sch = new School();
		System.out.println(sch.x);
		sch.write();

	}

}

