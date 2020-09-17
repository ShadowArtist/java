
/*
inheritance has two cases one is (    one parent having many children  )

 dusra case = aik parent ka child hua , phir aus ka child hua , phir jis ka hua tha child phir aus ka child hua like
 
 GrandGrandFather -> GrandFather ->Father ->Son
 

*/

// first case

// ais main parent ke value call ho ge aur child ke value call ho ge





public class INHERITANCE_CASE_1_One_Parent_Having_Many_Children {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D obj1 = new D();
		obj1.scale();
		obj1.pencil();
		
		B obj2 = new B();
		obj2.rubber(); // ais main wo apne aur parent class ka object call kr wa reha ha ,,,aur aisa he ho ga
		obj2.pencil();
		
		D obj3 = new D();
		obj3.pencil();
		obj3.scale();
		
		C obj4 = new C();
		obj4.pencil();
		obj4.sharpner();
		
		
		
		
		F obj5 = new F();
		
		obj5.engine();
		obj5.car();
		
		G obj6 = new G();
		obj6.SeatBelts();
		obj6.car();
		
		
		H obj7 = new H();
		obj7.Mirrors();
		
		J obj8 = new J();
		obj8.tail();
		obj8.horse();
		
		K obj9 = new K();
		
		obj9.eyes();
		obj9.horse();
		
		
		L obj10 = new L();
		
		obj10.chest();
		obj10.horse();
		
		
		M obj11 = new M();
		obj11.legs();
		obj11.horse();
		
		
		N obj12 = new N();
		obj12.head();
		obj12.horse();
		
		
		P obj13 = new P();
		obj13.seeds();
		obj13.Orange();
		
		
		Q obj14 = new Q();
		obj14.cover();
		obj14.Orange();

		
		
		
	}

}

//Task:Create multiple classes and their childs and their call their values in main class

//parent
class A{
	
	public void pencil() {
		System.out.println("this is a pencil");
		
	}
}

class B extends A{
	
	public void rubber() {
		System.out.println("this is a rubber");
	} 
	
}

class C extends A{
	 public void sharpner() {  System.out.println(" this is a sharpner ");    }
}


class D extends A{
	public void scale() {    System.out.println("  this is a scale   ");                     } 
}




class E {
	
	public void car() { System.out.println("this is car");  }
} 

class F extends E {
	public void engine() {  System.out.println(" car engine installed ");   }
}


class G extends E { public void SeatBelts() {System.out.println("  car seat belts  installed   ");         }   }

class H extends E { public void Mirrors() {System.out.println("  mirrors installed   ");}     }



class I
{  public void horse() {  System.out.println("Horse Formation");  }   }


class J extends I 
{  public void tail() {System.out.println("Tail formed");    }  }


class K extends I 
{  public void eyes() {System.out.println("Eyes Formed");  }  }


class L extends I   
{  public void chest() { System.out.println("chest formed ");   }       }

class M extends I
{  public void legs() { System.out.println(" legs formed ");   }      }

class N extends I
{ public void head() {System.out.println(" head created ");  }  }




class O
{public void Orange() {System.out.println( " Creating Orange  "  );    }    }


class P extends O
{public void seeds() {System.out.println(" their are seeds  ");}    }


class Q extends O
{public void cover() { System.out.println(" cover peeled   ");   }   }
























