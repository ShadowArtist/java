
public class Enhanced_For_By_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// this is how we allocate a memory of five objects in our array
		
		int arr[] = new int [5]; //allocated memory size for five integer datatype elements 
		
		
           arr[0/*this is index value zero*/]=12 /*this is the value stored on index value*/  ; // this is how we set values in our arrays 
           arr[1]=2;
           arr[2]=21;
           arr[3]=3;
           arr[4]=32;
           
           
           
           for(int list_to_be_printed : arr) {
        	   System.out.println(list_to_be_printed);
           }
           
           
		
	}

}
