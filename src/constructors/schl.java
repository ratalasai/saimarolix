package constructors;

public class schl {
	
	int stid;
	String stname;
	static int stmarks;
	static String stschl;
	
	public schl(int stid, String stname,int stmarks,String stschl) {
		
		this.stid=stid;
		this.stname=stname;
		this.stmarks=stmarks;
		this.stschl=stschl;
		
		
	}

	public void display() {
		
	      System.out.println(stid +" "+ stname +" "+ stmarks +" "+ stschl);
		
	}
	
	public static void main(String[] args) {
		
		schl s = new schl(01, "surya",50, "Abcd school");
		s.display();
		
		schl s1 = new schl(02,"Gill",49,stschl);
		s1.display();
		
		schl s3 = new schl(03, "virat",48, "zph school");
		s3.display();
		
		schl s4 = new schl(04,"Goutam",47,stschl);
		s4.display();
		
		schl sc = new schl(5,"sairatala",stmarks,stschl);
		sc.display();
	}
}
