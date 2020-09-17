abstract class Bank
{
	
abstract int getRateOfIntrest();


}

class SBI extends Bank
{
	
int getRateOfIntrest() 

{
return 7;	
}
}
 


class PNB extends Bank 

{
int getRateOfIntrest() 
{
return 8;	

}	

}





public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b;
		
		b= new SBI();
		
		System.out.println(b.getRateOfIntrest());  
		
		b= new PNB();
		System.out.println(b.getRateOfIntrest());
		
	}

}
