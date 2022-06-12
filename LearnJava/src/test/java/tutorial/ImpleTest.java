package tutorial;

public class ImpleTest implements MyInterface {

	public void openBrouser() {
		
		System.out.println("Type www.google.com");
		
		
	}

	public void getUID() {
		System.out.println("Get your ID ");
		
	}

	public void getPwd() {
		
		System.out.println("Insert your password ");
		
	}

	
	public static void main(String[] args) {
		
		
		ImpleTest obj = new ImpleTest();
		obj.openBrouser();
		obj.getUID();
		obj.getPwd();
	}
	
	
}
