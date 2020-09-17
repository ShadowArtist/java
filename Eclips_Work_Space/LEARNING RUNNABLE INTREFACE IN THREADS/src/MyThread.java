// learning runnable  interface


public class MyThread implements Runnable {

	// run has no return type , it is only void
	
	public void run()
	{
		System.out.println("I am a thread born in runnable interface");
	}
	
	
	public static void main(String [] args) 
	{
		
		/*
		 
		  Thread
public Thread(Runnable target)

Allocates a new Thread object. This constructor has the 
same effect as Thread (null, target, gname), 
where gname is a newly generated name. 
Automatically generated names are of the form "Thread-"+n,
where n is an integer.
Parameters:target - the object whose run method 
is invoked when this thread is started. If null,
this classes run method does nothing.
		  
		 */
		
//		Thread obj1 = new Thread(new MyThread());		
		
		Thread obj1 = new Thread(new MyThread());
	obj1.start();
		
		
		
	}
	
}
