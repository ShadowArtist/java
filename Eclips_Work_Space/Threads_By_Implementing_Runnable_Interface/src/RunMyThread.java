class MyRunnableThread implements Runnable
{

	//counter
	public static int myCount=0;
	
	
	//constructor initialiazing
	 public MyRunnableThread() {
		// TODO Auto-generated constructor stub
	}
	
	 
	 public void run() 
	 {
		// applying condition and increment on our constructor 
		 
		 while(MyRunnableThread.myCount <=10) 
		 {
			 
			 try {
				System.out.println("Explanation thread"+(++MyRunnableThread.myCount)  );
				Thread.sleep(100);
			} 
			 
			 catch (InterruptedException e) {
				// TODO: handle exception
			}
			 
			 
		 }
		 
		 
		 
	 }
	 
	 
	 
	
	
	
	
	
	
	
	//if we run this program now completing till here nothing will be shown on the screen of IDE because thread is not 
	 //yet started
	
	
	
	
	
	
}



public class RunMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.println("Starting Main Thread");
		
		
		// creating object of our implemented interface class
		
		MyRunnableThread mrt = new MyRunnableThread();
		
		/* putting the instance variable of our implemented interface class 
		in our Thread Object , inside its constructor.
		*/
		Thread t= new Thread(mrt);
		// now starting the thread
		
		t.start();
		
		// yehan tk huma zaroorat ha 
		
		
		
		
		
		
		
		
		
		
		
		
		//apna counter initialize kra  dusra loop chlane k lia
	/*	while (MyRunnableThread.myCount <=10 ) {
			
			try {
				
				System.out.println("Main Thread"+(++MyRunnableThread.myCount)  );
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}*/
		/*System.out.println("End of Main Thread");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
