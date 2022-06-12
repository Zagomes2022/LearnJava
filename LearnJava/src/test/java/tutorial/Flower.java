package tutorial;

public class Flower {
	
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

public int getFlower() {
	
	return 600;
				
}
	public String myComment() {
		
		return "give my flower";
				
	}
	
	public static void main(String[] args) {
		
		Flower.myPrise();
		Flower obj = new Flower();
		obj.myFlower();
		obj.getFlower();
		obj.myComment();
		System.out.println(obj.getFlower());
		System.out.println(obj.myComment());
		
		
		
	}
	
	
	
}
