
public class Bird_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Ducks.Fly();  //we are accessing child in parent class and applying method which is public 
		
		Ducks.Fly();
		
				
		
		
	}

}
class Ducks{
	
	
	
	//Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
		private static void  Swim() {
			
			
			
			System.out.println(" this duck can swim  ");
			
		}
		

		
		
	/*Public: The access level of a public modifier is everywhere.
	  It can be accessed from within the class, outside the class,
	  within the package and outside the package.*/	
		public static void Fly() {
			System.out.println(" this duck can fly ");
		
		
		}
		
}
		
		
		
		class Duck_1 extends Ducks {
			
			
			
		}	
		
	class Duck_2 extends Ducks {
			
		}


	class Duck_3 extends Ducks {
		
	}

	class Duck_4 extends Ducks {
		
	}