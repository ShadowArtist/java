
/*
 The abstract class can also be used to provide some implementation of the interface. 
 In such case,
  the end user may not be forced to override all the methods of the interface. 
  
  
  
  
  
  
 * */



interface A

{
	
void a ();
void b();
void c ();
void d();
	
}

abstract class B implements A
{
	/*
	 IF WE REMOVE PUBLIC THIS ERROR WILL COME
	  
	  
	  
	  Multiple markers at this line
	- Cannot reduce the visibility of the inherited method 
	 from A
	- implements A.c
	  
	  
	  
	  
	  */
	
	
	// hum na ais ko public ais lia kra ha ku ka hr jegha sa access ho ska  

	//implements A.c
public	void c()
{
	System.out.println(" i    am    c   ");
	}	


}


class M extends B 
{
/*
 Errors coming if we are not implementing aal the methods present in interface
 
 Multiple markers at this line
	- The type M must implement the inherited abstract 
	 method A.b()
	- The type M must implement the inherited abstract 
	 method A.a()
	- The type M must implement the inherited abstract 
	 method A.d()
  
  */
	
	public void a () {  System.out.println("i am a "); }  
	public void b() {System.out.println("i am b");}
	public void d() {System.out.println("i am d");}
	

}








public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// M ko call kr wain ga ku ka wo apne properties bhe rekha ga aur parent ke properties bhe rekha ga 
		A obj = new M() ;

obj.a();
obj.b();
obj.c();
obj.d();
	}

}
