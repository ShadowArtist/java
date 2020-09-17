
public class Reversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int list[]= {1,2,3,4,5};
	
	
	reverse(list);
	for(int i =0 ; i<list.length;i++) {
		
		}
	
	}

	public static void reverse(int list[]) {
		
		
		int newList[]=new int[list.length];
		
		for(int i=0 ; i<list.length ;i++) {
			
			newList[i] = list[list.length -1 -i];
			
			list = newList;
			System.out.println(list+ " ");
		}
		
		
	}	
	
	
}


