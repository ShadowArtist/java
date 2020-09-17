
import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		
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
		
		
		
		Scanner input = new Scanner(System.in);
		
		String name_check_from_list = input.next();
		
		
		if(list.contains(name_check_from_list))
		
		{
		System.out.println("yes this name is present in our database");	
			
		}
		else 
		{
			System.out.println("No this name is not present in our database");
		}
		
		
	
	
	}

}
