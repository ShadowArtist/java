import java.util.ArrayList;

public class For_Each_Of_You {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list=  new ArrayList<>();
		
		
		
		list.add("ali");
		list.add("rehan");
		list.add("kamran");
		list.add("nazakat");
		list.add("jon");
		list.add("kami");
		list.add("noman");
		list.add("nome");
		list.add("dock");
		list.add("jawe");
		list.add("owais");
		list.add("hadi");
		list.add("naeem");
		list.add("hamza");
		list.add("sharukh");
		
		list.add(1, "abc");
		for(String item : list) {
			
			System.out.println(item);
		} 
		
		
		
	}

}
