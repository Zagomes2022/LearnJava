package polymorphism;

//This is Child class

public class OverrideChild extends OverrideParent {

	public static void main(String[] args) {
		
		OverrideChild obj = new OverrideChild();
		obj.getHomeLoan();
		obj.getStudentLoan();
		System.out.println(obj.getHomeLoan());
		System.out.println(obj.getStudentLoan());
				
	} 
	
		
		public double getHomeLoan() {
			
			return 9.5;  
		}

	public double getStudentLoan() {
			
			return 3.5;  
		}
	
}
