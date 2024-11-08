package OOP;

class Desk{
	private int width = 900;
	private int height = 1200;
	
	void write() {
		System.out.println(width + " " + height);
	}
	
	int getWidth() {
		return width;
	}
	
	int getHeight() {
		return height;
	}
}

public class OOP3 {

	public static void main(String[] args) {
		
		Desk d = new Desk();
		d.write();
		
		int wid = d.getWidth();
		int hei = d.getHeight();
		
		System.out.println(wid + " " + hei);
		
	}

}
