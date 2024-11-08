package OOP;

class Window{
	public int width = 900;
	public int height = 800;
}

public class OOP2 {

	public static void main(String[] args) {
		
		Window w1 = new Window();
		Window w2 = new Window();
		
		w2.width = 500;
		w2.height = 500;
		
		System.out.println(w1.width + " " + w2.width);
		System.out.println(w1.height + " " + w2.height);

	}

}
