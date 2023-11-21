package Abstractions;

public class Ecomerce implements Demo {

	@Override
	public void Login() {

		System.out.println("succesfully login");
	}

	@Override
	public void signup() {

		System.out.println("succesfully signup to login");
	}

	@Override
	public void cart() {

		System.out.println("check the cart succesfully");
	}

	@Override
	public void whistlist() {

		System.out.println("check the whisitlist succesfully");
	}

	@Override
	public void search() {

		System.out.println("Tharun ratala");
	}

	@Override
	public void items() {

		System.out.println("check the items");
			
		}
	
	public static void main(String[] args) {
		
		Ecomerce e = new Ecomerce();
		e.Login();
		e.signup();
		e.cart();
		e.whistlist();
		e.search();
		e.items();
	}
	}


