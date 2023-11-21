package Encapsulation;

public class child extends parent{

	public String man = "Munna Bhaiii...";
	
	public void display() {
		System.out.println(super.man);
	}
	public static void main(String[] args) {
		
		child ch = new child();
		ch.display();
		
	}
	
}
