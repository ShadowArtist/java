
public class testing {

	//and static is giving access to it from any where 
	
 static	int asd =9; //<---this is the global variable assigned

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	inside main function is our local variable
		
		Factor.tester();
	
	Printer obj = new Printer();
	System.out.println(obj.a);
	
	System.out.println("this is from the global variable"+asd); 
	// and this global variable can called in the main class
	
	
	}

}



class Factor

{
	
	Factor()
	
	{
		
		//ais main khale calue initialize kerwata hain
	int a =1;
	int b= 2;
	
		
	}
	
	
	// for(int i =0 ; i<5 ; i++) {} loop class ka ander nai lg sakta beghair kise method ka
	
	//method ka ander ho reha  ha jo bhe ho reha ha ,,  
	//bahir 3 variables assign krain phir for loop lgyain 
	//class k ander wo huma error da ga 
	
	public static void tester() {
int a =1;
int b =2;
int c = 3;


for(int m=0;m<10;m++) 
{
int k=	a*b*c;
System.out.println(k);
}




	}

}




class Printer
{
int i=0;

int a ;
int b ;

Printer()
{
	
 a = 2;
 b = 3;
}	
	
}

