package tutorial;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Animal {

	public void myDog() {
		
		int a = 10;
		int b = 30;
		int c = (a+b);
		
		System.out.println(c);
		
	}
	
	public static void myCat() {
		
		double d = 10.50;
		double e = 20.50;
		double f = (d+e);
		
		System.out.println(f);
				
	}
	
	public void myCow() {
		
		String myComment = "Cow gives us milk";
		
	System.out.println(myComment); 
	
	}
	
		
	public static void main(String[] args) {
		
		Animal.myCat();
		Animal obj = new Animal();
		obj.myDog();
		obj.myCow();
			
	} 
	
	
	
}