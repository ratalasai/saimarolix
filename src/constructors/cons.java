package constructors;

public class cons {
	
	int empid;
	String empname;
	
	public void display() {
		
		System.out.println(empid +" " + empname);
		
	}
	public static void main(String[] args) {
		cons c = new cons();
		c.display();
	}

}
