// in here i maked the main class when it asked me before making this project  


class Threads extends Thread

{

	// class main yad rekhna jub kuch ho ga ai to kia print kr wao ga
	
	
	
	public void run() 
	
	{

		
			System.out.println(" hi i am borned as a thread and my life started in run method");
	
		
		

	}
	
}






public class MyThreads  {


	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Threads obj1 = new Threads();
		
		/*
		 when i tried to print obj1.start(); method in system.out.println
		 
		 it gives me this error
		 
		 The method println(boolean) in the type PrintStream
		 is not applicable for the arguments (void)
		 
		 * */
		
		
		/*you can not call the run(); method directly over here if you do it
		 * will give tis error
		 
		 The method run() is undefined for the type MyThreads <-- MyThreads is the main class
		 
		 */
	
		
                 obj1.start();
		Threads obj2 = new Threads();
		
		obj2.run();
		
                 
	}

}
