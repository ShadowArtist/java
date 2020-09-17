

/*
  
 hum na jub kise aik chez ko private kia na to aus ka acces he hat gya 
  
 jo object hum na dusre class main bnya ho ga na 
 
  wo private fields ko acces he nai kr pye ga    ku k ausa nazer he nai a rahe ha bhe 
 * */

class A
{
/*private*/  public  String a;

/*private*/ public void print() 
{
	
	a="sadasd";
System.out.println(a);	
}

}





public class AccessLevelChupanChupai {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		A obj = new A();
	
		
		//yehan pa ausa private fields nazer nai a rahe hain 
		obj.print();
	
	}

}
