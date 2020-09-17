class Derived {
	
	public void getDetails() {
		
		System.out.printf("Derived class ");
	}
	
}







 class Test extends Derived
{

	public void getDetails() {
		System.out.printf(" Test Class ");
		
		super.getDetails();
		
	}
	
}










public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived obj=new Test();
		obj.getDetails();
		
		
		
		
		
	}

}
