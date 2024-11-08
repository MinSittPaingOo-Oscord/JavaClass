package OOP;

class Chair{
	
	private double base;
	private double height;
	
	Chair(int b,int h){
		base = b;
		height = h;
	}
	
	void write() {
		System.out.println(base + " " + height);
	}
	
}

public class OOP5 {

	public static void main(String[] args) {
		
		Chair ch = new Chair(4, 5);
		ch.write();
		

	}

}
