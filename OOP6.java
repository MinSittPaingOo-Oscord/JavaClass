package OOP;

class Parent{
	protected int x = 90;
	protected int y = 100;
	
	void write() {
		System.out.println("This is parent");
	}
}

class Child extends Parent{
	void write() {
		System.out.println("This is child");
	}
}

public class OOP6 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		System.out.println(ch.x);
		System.out.println(ch.y);
		ch.write();
		
		Parent p = new Parent();
		System.out.println(p.x);
		System.out.println(p.y);
		p.write();
		
	}

}
