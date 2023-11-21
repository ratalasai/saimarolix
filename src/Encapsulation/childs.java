package Encapsulation;

public class childs extends parents {
	
	public void cars() {
		
		System.out.println("Hondaiii");
	}
	
	public void display() {
		super.cars();
	}
	
	public static void main(String[] args) {
		
		childs ch = new childs();
		ch.display();
		ch.cars();
	}

}
