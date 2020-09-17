class s implements Runnable
{
	
int x,y;



/*The Java synchronized keyword is an essential tool in concurrent programming in Java. 
 * Its overall purpose is to only allow one thread at a time into a particular section of code 
 * thus allowing us to protect, for example, variables or data 
 * from being corrupted by simultaneous modifications from different threads. 
 * This article looks at how to use synchronized in
 *  Java to produce correctly functioning multithreaded programs. */







public void run()
{
//for(int i=0;i<1000;i++)
	synchronized(this) {
		
		x=12;
		y=12;
		
	}
System.out.print(" this is x value  "+x+"     This  is y  value "+y+ " ");

}



}














public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		// here we created an object
		s run = new s();
		
		
		Thread t1=new Thread(run);  //this part will run and print the values of x and y
		Thread t2=new Thread(run);  // same procedure as t1
		
		
		
		
		t1.start(); // this will initialize that pirticular thread to start to start 
		t2.start(); 
		
		
		
	}

}


/* bhai jitne chao thread bnao aur ausa start krdo phir synchronize ke 
 * wejha sa wo aik he bar thread chle ga ,values print krwye ga, aus k 
 * bad dusra thread main  aye ga aur aus ke values print kr wye ga 
 * aur thread nia milan ga to output a gye ga  */


