package encapsulation;

public class SetEncapsulation {

	public static void main(String[] args) {
		
		Encapsul obj = new Encapsul();
		obj.getA();
		obj.getB();
		obj.getC();
		
		obj.setA(500);
		obj.setB(600);
		obj.setC(700);
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
		
		
	}
	
}
