package OOP;

abstract class Employee{
	String name, post;
	double basicsalary;

	Employee(String n, String p, double s){
		name = n;
		post = p;
		basicsalary = s;
	}

	public void Display() {
		System.out.println("Name : " + name);
		System.out.println("Post : " + post);
	}

	public abstract String Pay_Salary();

}

class Manager extends Employee{
	double allowance;
	Manager(String n,String p,double s,double a){
		super(n,p,s);
		allowance = a;
	}
	public String Pay_Salary() {
		return "Manager Salary = " + (basicsalary+allowance);
	}
}

class Lecturer extends Employee{
	double bonus;
	Lecturer(String n,String p,double s,double b){
		super(n,p,s);
		bonus = b;
	}
	public String Pay_Salary() {
		return "Lecturer Salary = " + (basicsalary+bonus);
	}
}

class OfficeStaff extends Employee{
	OfficeStaff(String n,String p,double s){
		super(n,p,s);
	}
	public String Pay_Salary() {
		return "Admin Staff = " + basicsalary;
	}
}

public class testEmployee {

	public static void main(String[] args) {
		Employee E[] = new Employee[3];
		E[0] = new Manager("Jhon","Manager",10000,1000);
		E[1] = new Lecturer("Susan","Lecturer",5000,700);
		E[2] = new OfficeStaff("David","Office Staff",3500);

		for(int i=0;i<E.length;i++) {
			E[i].Display();
			System.out.println(E[i].Pay_Salary());
			System.out.println("__________________________________");
		}
	}
}

