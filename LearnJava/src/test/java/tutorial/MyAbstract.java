package tutorial;

public abstract class MyAbstract {

	public void myFlower() {
		
		int Rose = 100;
		int Jasmin = 200;
		int Total = (Rose + Jasmin);
		
		System.out.println(Total);
	}
	     
	public static void myPrise() {
		
		double Rose = 10.50;
		double Jasmin = 15.50;
		double Prise = (Rose + Jasmin);
		System.out.println(Prise);
		
	}

	public abstract void howMuch();
	
	public abstract void willPay();
	
	public abstract void okDone();
	
	
}
