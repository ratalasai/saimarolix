package constructors;

public class consc {
	
	int empid;
	String empname;
	static String empcompany;
	
	public consc(int empid,String empname,String empcompany) {
		
		this.empid=empid;
		this.empname=empname;
		this.empcompany=empcompany;
		
	}

	public void display() {
		
		System.out.println(empid +" "+ empname +" "+ empcompany);
		
	}
	
	public static void main(String[] args) {
		
		consc c = new consc(123, "sai", "marolix");
		c.display();
		
		consc c1 = new consc(890,"siddu","marolix");
		c1.display();
		
		consc c3 = new consc(789, "srii", empcompany);
		c3.display();
		
		consc c4 = new consc(345,"john",empcompany);
		c4.display();
		
		
	}
}

