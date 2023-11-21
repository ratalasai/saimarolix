package Conditions;


public class Break_continue {

	public static void main(String[] args) {

		int num=10;
		
		for(int i=0;i<=num;i++) {
			
		/*	if(i==5) {
				continue;
			}
			else {
			System.out.println(i); // 0 1 2 3 4 6 7 8 9 10
			}
		*/
			
			if(i==6) {
				
			break;
			}
			else {
				System.out.println(i);  // 0 1 2 3 4 5
			}
			
			
			
			
		}
		
	}

}
