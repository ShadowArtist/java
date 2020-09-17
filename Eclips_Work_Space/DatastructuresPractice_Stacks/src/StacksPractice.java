class Stack{
	int stck[]=new int[10/*max capacity*/];
	int tos;//top of stack
	
	
	
	public Stack() {
		// TODO Auto-generated constructor stub
	tos=-1;// we defined the stack value to start from -1
	
	}
	
	
	// push item on to the stack
	
	
	/*
	 VALUES COMING TO ITEM 
	  
	  
	  0
	  1
	  2
	  3
	  4
	  5
	  6
	  7
	  8
	  9
	 * */
	
	
	
	void push(int item) {
	if(tos==9) 
	{
	System.out.println("Stack if full");	
	}
	
	else 
	{
		/*
		 TOS VALUES 
		           
		           
		           +1 braber ha ++tos ka
		           
		           ais ka matlab hua k +1 kro aur tos main store kro
		           
		  -1 +1  (++tos  ) 
		  
		  1+1
		  2+1
		  3+1
		  4+1
		  5+1
		  6+1
		  7+1
		  
		  8+1
		  
		  
		 * */
		
		
		
		
		stck[++tos/* jo bhe tos ke current value ha aus main one add kro phir tos main store kro , aur ausa stack ka index pa rekh do  */]=item/*jo bhe item sa value aye ge ausa stack ka aus index k ander phenk do jo currently chal reha ha*/;
	}
	
	
	}
	
	
	// pop an item from the stack
	 int pop() 
	    
	     {
		 
		 if(tos < 0) 
		 {
			 //ager tos (top of stack) minus 1 ha to to stack underflow ha 
			 
			 System.out.println("Stack underflow");
			 return 0;
	     }
		 else 
		 {
			 /* ager stack ka index pa minus one nahe ha to
			  jo mojuda stack ka index ha aus main sa 
			  
			   current tos jo store hua wa ha aus main sa 1 minus kro   
			    
			  *  */
			 return stck[tos--];
		 }
		 
		 
		 
	    }
	
	
	
	
}









public class StacksPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack mystack1= new Stack(/*over here by default in consturctor tos is minus 1 because we had initialized above in class*/);
		
		Stack mystack2=new Stack(/*over here by default in consturctor tos is minus 1 because we had initialized above in class*/);
		
		
		//push some numbers on to the Stack
		for (int i = 0; i < 10; i++) {
/*
  
      
  
  
 * */
			
			mystack1.push(i);	
		}
		
		//push some numbers on to the Stack
				for (int i = 10; i < 20; i++) {
		/*
		  
		      
		  
		  
		 * */
					
					mystack2.push(i);	
				}
				
				

				//pop those numbers off the stack
				
				System.out.println("Stack in my stack1:");

				
				for (int i = 0; i < 10; i++) {
					/*
					  
					      
					  
					  
					 * */
								System.out.println(mystack1.pop());
									
							}
							
				//pop those numbers off the stack
				System.out.println("Stack in my stack2:");
									for (int i = 10; i < 20; i++) {
							/*
							  
							      
							  
							  
							 * */
										System.out.println(mystack2.pop());
											
									}
		
		
	}

}
