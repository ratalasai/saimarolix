package Abstractions;

public class child implements parent_3,parent_2,parent_1{

	@Override
	public void india() {

		System.out.println("India");
	}

	@Override
	public void America() {

		
		System.out.println("America");
	}

	@Override
	public void pakistan() {

		System.out.println("Pakistan");
	}
	public static void main(String[] args) {
		
		child c = new child();
		c.india();
		c.America();
		c.pakistan();
		c.Bangladesh();
		c.test();
	}

	@Override
	public void Bangladesh() {

		System.out.println("Bangladesh");
	}

	@Override
	public void test() {

		System.out.println("Test :");
		
	}
}
