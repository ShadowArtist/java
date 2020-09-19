
public  class Robots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ais ka ander mojude values output main nai ayain ge
		// ya values yehan pa aislia de hain taka constructor initialize ho ska
		robot obj1 = new robot(1,1); // yehan pa initialize kr waya ha constructor ko
	
	
	
	}

}


// Ultimate Constructors Practice

  class robot


  {
	  int a,b,c,d,e,f;	  
	  
public robot(){
	int a = 2;
System.out.println("this is from default constructor "+a);
}


	robot(int a ,int b){  
	a=1;   
	b=2;
	System.out.println("this is from  int int constructor  "+a+ "  "+b);
	}
	
	
	
	
	//robot(int a){a=1;}
	
	robot(float a){a=1;
	System.out.println(a);
	}
	
	robot(String a){}
	
	robot(int a , String b){}
	
	// pta ha ager main yehan pa data typye ko age pecha kr ka rekh du ga aik method ko
	
	robot(float c,String b,int a){
		System.out.println(c+"   "+b+"  "+a); // yehan pa value call kr wa de
	}
	
	robot(float c , int a , String b){}
	
	robot(float a ,float b ,int c,int d , String e , String f){}
}

class _ extends robot

{
	_(int a , int b){}
	
	_(int a){}
	
	_(float a){}
	
	_(String a){}
	
	_(int a , String b){}
	
	_(int a ,String b, float c){}
	
	_(float c , String b , int a){}
	
	_(float c , int a , String b){}
	
	_(float a, float b , int c ,int d, String e ,String f){}

}


class $ extends robot
{
	
$(int a ,int b){}

$(int a){}

$(float a){}

$(String a){}

$(int a , String b){}

$(int  a , String b ,float c){}

$(float c , String b , int a){}

$(float a , float b , int c , int d , String e , String f){}




}


