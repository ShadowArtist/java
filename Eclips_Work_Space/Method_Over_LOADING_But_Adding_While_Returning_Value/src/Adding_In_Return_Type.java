
public class Adding_In_Return_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Overloading obj1 = new Overloading();
		
		System.out.println(" Sum = "+ obj1.add(1, 2)  );
		
	}

}




class Overloading{

	
	
public int add(int a,int b) {
	
	return a+b;
}


public int add(int a,int b,int c) {
	
	return a+b+c;
}


public int add(int a,int b,int c , int d) {
	
	return a+b+c+d;
}


}