package polymorphism;

public class overriding_child extends overriding{
	
	public void milk() {
		
		System.out.println("sweet");
	}
	
	public static void main(String[] args) {
		
		overriding oc = new overriding_child();
		oc.milk();
		
		overriding ov = new overriding();
		ov.milk();
	}


}
