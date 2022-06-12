package tutorial;

public class Runtest extends MyAbstract{
	
		
	@Override
	public void howMuch() {
		int rose = 10;
		int jasmin = 20;
		int total = (rose + jasmin);
		System.out.println(total); 
				
	}

	@Override
	public void willPay() {
	  
		System.out.println("your flower prise is good");
		
	}

	@Override
	public void okDone() { 
		System.out.println("Gige me ten rose");
		
	}

	public static void main(String[] args) {
		
		Runtest obj = new Runtest();
		obj.howMuch();
		obj.willPay();
		obj.okDone();
			
		
	}
	
	
	
}
