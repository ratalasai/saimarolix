package loops;

public class Nested_loop {

	public static void main(String[] args) {

		int month=12;
	    int week=4;
	    int days=7;
	    
	    for(int i=1; i<=month; i++) {
	    	System.out.println("month: "+i);
	    	
	    	for(int x=1; x<=week; x++ ) {
	    		System.out.println("week: "+x);
	    		
	    		for(int y=1; y<=days; y++) {
	    			System.out.println("day: "+days);
	    			
	    		}
	    	}
	    }
		
	}

}
