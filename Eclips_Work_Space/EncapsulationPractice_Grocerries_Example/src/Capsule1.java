

class CapsuleMaterial

{
	
private String material;


public  void putMaterial() 

{

	material=" putting material in capsule ";
	
	/*Ctrl + space */
	
	
	
	System.out.println(material);
	
}






}

public class Capsule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 CapsuleMaterial Material = new CapsuleMaterial();
		 
		Material.putMaterial();
		
		 
	}

}


/* in which capsule you want to put medicine  
 * 
 * Capsule 1 or capsule 2  
 *   */
 class Capsule2 {

	 
	 // Body of the capsule 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CapsuleMaterial Material = new CapsuleMaterial();
		Material.putMaterial();
		
	}
	
	//CapsuleMaterial Material = new CapsuleMaterial();
	
}
