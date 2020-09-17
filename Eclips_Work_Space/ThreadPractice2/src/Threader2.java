class Threader extends Thread

{
	
public void run() 

{
	
System.out.println("Thread is running ");
	
}
	
}




public class Threader2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Threader obj = new Threader();
		
		obj.start();
		
	}

}
