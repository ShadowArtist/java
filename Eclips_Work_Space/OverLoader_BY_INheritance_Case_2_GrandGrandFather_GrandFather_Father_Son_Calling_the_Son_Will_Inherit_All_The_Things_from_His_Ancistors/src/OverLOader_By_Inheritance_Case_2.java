// APPLYING CASE 2 OF INHERITANCE IN METHOD OVERLOADING 


public class OverLOader_By_Inheritance_Case_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//OVER HERE SON HAD ACCESS TO ALL THE ANCESTOR VALUES AND OVERLOADED METHODS 
		
	System.out.println(" Sum :  "+Son.add(1, 2));	
		
	}

}



 class GrandGrandFather{
	
public static int add (int a , int b) {
	
	return a+b;
}	
	
	
}


class GrandFather extends GrandGrandFather {
	
	public static int add(int a ,int b , int c) {
		
		return a+b+c;
	}
	
}


class Father extends GrandFather{

	public static int add(int a , int b ,int c , int d) {
		
		return a+b+c+d;
	}
	
	
}



class Son extends Father {
	
	public static int add(int a ,int b , int c , int d ,int e) {
		
		return a+b+c+d+e;
	}
	
}