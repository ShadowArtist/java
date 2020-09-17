
interface Contract{
	void Aaa();
}

interface Page1 extends Contract{
	void Bbb();
}

class A{
	void CcPrint() 
	{
		System.out.println(" print ");
	}
}


class Hello extends A implements Page1{

	
	
	A a = new A();
	
	

	
	@Override
	public void Aaa() {
		// TODO Auto-generated method stub
		
		a.CcPrint();
	}

	@Override
	public void Bbb() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}



public class MultipleInheritance {

	
	public static void main(String args[]) 
	
	{
		Hello hello = new Hello();	
		
		hello.CcPrint();
		
		hello.Aaa();
		
	}
	
	
	
}
