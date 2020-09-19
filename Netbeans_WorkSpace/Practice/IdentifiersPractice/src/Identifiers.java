
public class Identifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*these two (_ , $ ) are leagal identifiers because 
		 * they are not defined or reserved in java
		 * 
		 * */
		
		
		
		//'_' should not be used as an identifier,
		//since it is a reserved keyword from source level 1.8 on
		
		/*The place to look is JLS §15.27.1. Lambda Parameters

It is a compile-time error if a lambda parameter has the name 
_ (that is, a single underscore character).

The use of the variable name _ in any context is discouraged.
 Future versions of the Java programming language may reserve this name 
 as a keyword and/or give it special semantics.

So the Eclipse message is misleading, 
especially as the same message is used for both cases,
 when an error is generated for a lambda parameter or
 when a warning is generated for any other _ identifier*/
		
		
		int _ = 2; 
		System.out.println(" printing value in underscore " +_);
		
		int $ = 3;
		System.out.println("printing value of dollar sign "+ $);
		
		
		int $123=2;
		System.out.println("printing dolar with numeric values  " + $123);
		
		
		System.out.println( _ + $ + $123  +" Here i am summing all of these variables");
		
		
		
		/*
		int #=1;
		int %=2;
		int ^=2;
		int &=2;
		int *=1;
		int (=1;
		int )=2;
		int[ =2;
		int ?=9;
		int >=2;
	      .
	      .
	      .
	    these all and many more symbol are illegal identifiers
	
	*/
	
	}

}
