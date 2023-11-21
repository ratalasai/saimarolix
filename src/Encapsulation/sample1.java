package Encapsulation;

public class sample1 extends sample{

	public static void main(String[] args) {
		
		sample s = new sample();
		
		s.setempid(2002);
		s.setempname("sai sai");
		
		System.out.println(s.getempid());
		System.out.println(s.getempname());
	}
}
