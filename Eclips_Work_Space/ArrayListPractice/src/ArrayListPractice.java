import java.util.ArrayList;
public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list_1 = new ArrayList<>();
		
		
		list_1.add("a");
		list_1.add("b");
		list_1.add("c");
		list_1.add("d");
		
		
		list_1.remove(2); // here we removed the string on index2
		
		
		for(String list_1_storage : list_1) {
			System.out.println(list_1_storage);
		}
		
		
		
		ArrayList<String> list_2 = new ArrayList<String>();
		
		list_2.add("a2");
		list_2.add("b2");
		list_2.add("c2");
		list_2.add("d2");
		
		
		for(String list_2_storage : list_2) {
			System.out.println(list_2_storage);
		}
		
		
		
		
		
	}
	

}
