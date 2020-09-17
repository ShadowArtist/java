
public class Method_Over_Rider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		
		// ALWAYS REMEMBER IN OVER RIDING static WILL NOT COME IN OVERRIDING
		//TUMHAIN RUN TIME PA PTA CHLE GA KA YA KIS KO OVER RIDE KR REHA HA 
		
		//PARAMETER SAME HON GA CHILD AUR PARENT KA ANDER , AGER SAME NAI HON GA TO OVERRIDING POSSIBLE NAI HO GE
		
		Parent_Rider obj1 = new Child_Rider_1(); // you will set/call the instance here of the one you want to call  
		
		System.out.println(" Sum "+obj1.add(2, 2)); 
		
	}

}



class Parent_Rider{
	
	public  int add(int a , int b ) {
		
		System.out.println(" I am THE PARENT ");
		return a+b;
	}

}


class Child_Rider_1 extends Parent_Rider{
	

	public int add(int a , int b ) {
		System.out.println(" I am from child rider 1 ");
		
		return a+b;
	}
	
}


class Child_Rider_2 extends Parent_Rider {
	
public  int add(int a , int b) {
		
		System.out.println(" I am from child rider 2 ");
		return a+b;
	}
	
} 

class Child_Rider_3 extends Parent_Rider {

	
public  int add(int a , int b ) {
		
	System.out.println(" I am from child rider 3 ");
		return a+b;
	}
	
} 