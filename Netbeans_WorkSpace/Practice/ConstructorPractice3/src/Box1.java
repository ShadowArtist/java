//parameterized constructor

class Box
{
	
double width;
double height;
double depth;


 Box(double w, double h , double d) 
 {
	 
	 width = w;
	 height=h;
	 depth=d;
	 
 }

 double volume() 
 {
	 return width*height*depth;
 }
 

}







public class Box1 {

	public static void main(String[] args) {
		// declare ,allocate , and initialize Box objects
		
		double vol;
		
		Box mybox1 = new Box(10,20,15);
		
		Box mybox2 = new Box(3,6,9);
		
		vol = mybox1.volume();
		System.out.println("my box 1 volume "+vol);
		
		vol = mybox2.volume();
		
		System.out.println("my box 2 volume "+vol);
		

	}

}
