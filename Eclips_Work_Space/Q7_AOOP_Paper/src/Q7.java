












public class Q7 {

	public static void main(String[] args)
	throws InterruptedException
	
	{
	Thread thread1 = new Thread(new Test());
	
	thread1.start();
	thread1.start();
	
	System.out.println(thread1.getPriority());

	}

}
