package operators;

public class Ternary {

	public static void main(String[] args) {

		int x=10;
		int y=15;
		int z=20;
		
		int result=(x>y)?x:y;
		int result2=(x+z>y+x)?((x+y<y+z)?z:y):((y+z>x+z)?x:y); //Ternary 
		
		System.out.println(result);
		System.out.println(result2);
		
		
	}

}
