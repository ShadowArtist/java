import java.util.Scanner;

public class calculation {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);


		
		System.out.println("take 2 input and addition will be performed");
		double addition= (     input.nextInt() + input.nextInt()  );
		System.out.println(" Ans = "+addition);
		
		
		
		
		System.out.println("take 2 input and substraction will be performed");
		double substraction= (     input.nextInt() - input.nextInt()  );
		System.out.println(" Ans = "+substraction);
		
		
		
		
		System.out.println("take 2 input and multiplication will be performed");
		double multiplication= (     input.nextInt() * input.nextInt()  );
		System.out.println(" Ans = "+multiplication);
		
		
		
		System.out.println("take 2 input and division will be performed");
		double division= (     input.nextInt() / input.nextInt()  );
		System.out.println(" Ans = "+division);
	}

}
