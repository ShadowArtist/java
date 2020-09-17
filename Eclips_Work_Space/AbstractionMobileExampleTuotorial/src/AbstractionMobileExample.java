
//the class which has all the implementation details is hidden by abstract method 
abstract class Mobile_Architecture
{
	
//parts that are common in every mobile will come in void Method(){} or public void Method(){}

	
void Buttons() 

{
System.out.println(" buttons clicked ");	
}
	

void ScreenDisplay() 
{
	
System.out.println("displaying screen");
}
	


//parts / things / circuting / architecture ,,, that vary and are necessary to be attached

abstract void Battery();

abstract void CircuitBoard();


}



class Mobile_1 extends Mobile_Architecture
{
void Battery() 
{
System.out.println(" Battery of Mobile 1 is Of 12 Volts ");		
}


void CircuitBoard() 
{
	
System.out.println( " Circuit board 1 "  );
}

}



class Mobile_2 extends Mobile_Architecture
{
	void Battery() 
	{
	System.out.println(" Battery of Mobile 2 is Of 10 Volts ");		
	}


	void CircuitBoard() 
	{
		
	System.out.println( " Circuit board 2 "  );
	}
}


public class AbstractionMobileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		
		ya direct object level pa error ais lia da reha ha ku ka aisa abstract class he nazer 
		
		nai a rahe ha 
		
		
		  Mobile_Architecture obj = new Mobile_Architecture();
		  
		    
		  
		 * */
		
		 
		
		
		
		//Mobile 1
		Mobile_1 parts_attach = new Mobile_1();
		
		// parts present in every mobile
		parts_attach.ScreenDisplay();
		parts_attach.Buttons();
		
		// parts that may vary in every mobile
		
		parts_attach.Battery();
		parts_attach.CircuitBoard();
	
		
		
		
	// Mobile 2	
Mobile_2 parts_Attach = new Mobile_2();
		
		// parts present in every mobile
		parts_Attach.ScreenDisplay();
		parts_Attach.Buttons();
		
		// parts that may vary in every mobile
		
		parts_Attach.Battery();
		parts_Attach.CircuitBoard();
		
	}

}
