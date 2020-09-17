/*
 * 
 * if i am not writing public in run(){}  method this error is coming
 * 
 * 
 * 
 * Multiple markers at this line
	1) Cannot reduce the visibility of the inherited method from Thread
	
	
	here the problem is Thread can not access the run() method in my class 
 * 
 * 
 * 
 * here run(){}  method should not be dafault access modifier neither private , nor protected 
 * 
 * only public so it could be visible 
 * 
 * */






class MyThreads extends Thread
{
	
	// here by run() method the life cycle of thread start 
	
	// the thing that you will type in thread will be initiated in the thread method
	
	public void run() 
	{
	System.out.println("Hello this is my first thread program");	
	}
	
	
}


public class Threadss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 start
		 
public void start()

Causes this thread to begin execution;
 the Java Virtual Machine calls the run method of this thread. 
The result is that two threads are running concurrently:
 the current thread (which returns from the call to the start method) and the other
  thread (which executes its run method). 

It is never legal to start a thread more than once
.In particular, a thread may not be restarted once 
it has completed execution.
Throws:IllegalThreadStateException :
if the thread was alreadystarted.See Also:run(), stop()
		 
		  */
		
		
		MyThreads obj1 = new MyThreads();
		
		obj1.start();
		
	}

}
