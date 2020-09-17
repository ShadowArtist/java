abstract class Shape

{
	
abstract void draw();

}


class  rectangle extends Shape

{

	void draw()
{
System.out.println("Draws Rectangle");	

}	

}



class circle extends Shape

{
	
void draw() 
{

	System.out.println("Draws Circle");
	
}

}








public class TestAbstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// jub tk circle ko Shape ka child nai bnao ga aus waqt tk error deta reha ga 
		
		Shape obj = new circle();
		
		obj.draw();
		
	}

}
