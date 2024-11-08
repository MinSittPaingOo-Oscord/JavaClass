package OOP;

class Table{
	
	Table(int x,int y){
		System.out.println("This is table");
		System.out.println(x+y);
	}
	
}

public class OOP4 {

	public static void main(String[] args) {
		
		Table t = new Table(5,6);
		new Table(8,9);
	}

}
