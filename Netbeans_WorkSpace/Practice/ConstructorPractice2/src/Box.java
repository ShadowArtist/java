//non parameterized constructors


class Box1{
	double width;
	double height;
	double depth;
	
	//this is the constructor for Box1
	Box1()
	{
		width =10;
		height =10;
		depth =10;
		
	}
	
	double volume() {
		return width*height*depth;
	}
	
}
















public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vol;
		
		Box1 mybox1 = new Box1();
		
		vol = mybox1.volume();
		
		System.out.println("Volume of box 1 is "+vol);
		
		
		Box1 mybox2 = new Box1();
		
		vol = mybox2.volume();
		
		System.out.println("Volume of box 2 is "+vol);
	}

}
