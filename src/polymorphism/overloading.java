package polymorphism;

public class overloading {
	
	
	public void sai() {
		
		System.out.println("ram ram bhaii...");
	}

	public void sai(int a, int b) {
		
		System.out.println(a/b);
	}
	
    public void sai(int a, int b, int c) {
		
    	System.out.println(a+b+c);
	}

	public void sai(int a, long b) {
		
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		overloading ol = new overloading();
		ol.sai();
		ol.sai(10, 10, 80);
		ol.sai(10,10);
		ol.sai(10,10);
	}
}
