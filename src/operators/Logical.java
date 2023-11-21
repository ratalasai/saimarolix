package operators;

public class Logical {

	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		
		boolean r1 = (a>b) && (a<b); //logical AND
		boolean r2 = (a>b) || (a<b); //logical OR
		boolean r3 = !(a>b); //logical NOT
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}
