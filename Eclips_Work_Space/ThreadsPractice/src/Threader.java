
public class Threader extends Thread {

public void run() 

{
System.out.println("My thread is in running state");	
}	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Threader obj = new Threader();
		
		obj.start();
	}




}
