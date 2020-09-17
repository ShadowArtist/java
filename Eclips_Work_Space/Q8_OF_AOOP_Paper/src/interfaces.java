interface calculate
{
void cal(int item);	
}

class display implements calculate{
	
	int x;
	public void cal(int item)  // method /function is created with parameter on data type int and variable of item 
	{
		// calculation is performed 
		
		x=item*item;
	}
	
}










public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		display arr = new display();
		arr.x=0;
		arr.cal(2); // method called and 2 is calculated by method/function of cal
		System.out.print(arr.x);
		
	}

}
