
//// in here i did not maked the main class when it asked me before making this project

public class Practice_Thread extends Thread{

	
	public void run() 
	{
		System.out.println("i am borned i am a thread and my thread started");
	}
	

	
	
	
	public static void main(String [] args) 
	{
		
		Practice_Thread obj1 = new Practice_Thread();
		obj1.start();
	}
	
}


