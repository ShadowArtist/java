/*
 CHALLANGE
  
 take string = "  A Quick Brown Fox Jumps Over The Lazzy Dog !   " 
  
 
 find small alphabets
 
 find capital alphabets
 
 count vowels 
 
 find vowels
 
 find total count of small and capital alphabets 
 
 count special characters 
 
 
 count repetition of alphabets
 
 
 count total words 
 
 
  */

public class String_Ultimate_Challange {
	  
	// i had taken count , counter_for_vowels  , and char   , as global and static because i want to access  them from any where.  
	
	
	/*Jo Variable Yellow hua wa hain wo mena Global lia hua hain taka main aunhain eaisly acces kr sakun */
	
	
	
	
	
	
static	int count =0; //  counter for character or letters 
static int counter_for_vowels;
static int counter_for_special_characters;
static char ch; // used this variable to find vowels and special characters


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String sentence = "A Quick Brown Fox Jumps Over The lazzy Dog ! ";
	
	// Finding Capital Alphabet
	
	System.out.println("These are capital letters in our sentence");
		for(int i=0 ; i<sentence.length();i++) {
			
			/*Character
			 
			  
			  
			  
			 * The Character class wraps a value of 
			 * the primitive type char in an object. 
			 * An object of class Character contains a single 
			 * field whose type is char. 
In addition, this class provides a large number
 of static methods fordetermining a character's
  category (lowercase letter, digit, etc.)and for 
  converting characters from uppercase to lowercase and viceversa. 
*/
			
			
		
			/*
			  
			 * isUpperCase
			  
			  
			  
			  
public static boolean isUpperCase(char ch)

Determines if the specified character is an uppercase character. 
A character is uppercase if its general category type, provided by Character.getType(ch), is UPPERCASE_LETTER.or it has contributory property Other_Uppercase as defined by the Unicode Standard. 

The following are examples of uppercase characters: 

 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z


			
			 * */
			
			
			
		
			
			
			/*
			 charAt
public char charAt(int index)

Returns the char value at thespecified index. An index ranges from 0 to length() - 1.
The first char value of the sequence is 
at index 0, the next at index 1,and so on, as for array indexing. 

If the char value specified by the index is a surrogate, the surrogate
value 
is returned.
Specified by:charAt in interface CharSequenceParameters:index - the index of the char value.Returns:the char value at the specified index of this string.The first char value is at index 0.
			  
			 * 
			 * 
			  
			 
			 *
			 * 
			 * */
			
			
	// FINDING UPPER CASE LETTER		
			
			if(Character.isUpperCase(sentence.charAt(i)    )) 
			{
				System.out.print(sentence.charAt(i));
			}
			
		}
	
	// just printing new line here
		System.out.println("  ");
		System.out.println("  ");
	
		
		
		
		
		
		
		
		
		
		
		//NOW FINDING LOWER CASE LETTERS HERE
		System.out.println("These Are small letters in our String ");
		
		
		
for(int i=0 ; i<sentence.length();i++) {
		/*
		  Character  is  a class in java   
		  
		  read more about this class from 
		  
		  https://www.geeksforgeeks.org/character-class-java/
		  
		  */	
			
	
	/*Character
			 
			  
			  
			  
			 * The Character class wraps a value of 
			 * the primitive type char in an object. 
			 * An object of class Character contains a single 
			 * field whose type is char. 
In addition, this class provides a large number
 of static methods fordetermining a character's
  category (lowercase letter, digit, etc.)and for 
  converting characters from uppercase to lowercase and viceversa. 
*/
			
			
		
			/*
			  
			 * isLowerCase
			 
			 
			 
public static boolean isLowerCase(char ch)

Determines if the specified character is a lowercase character. 
A character is lowercase if its general category type, providedby Character.getType(ch), is LOWERCASE_LETTER, or it has contributory propertyOther_Lowercase as defined by the Unicode Standard. 

The following are examples of lowercase characters: 

 a b c d e f g h i j k l m n o p q r s t u v w x y z



			
			 * */
			
			
			
		
			
			
			/*
			 charAt
public char charAt(int index)

Returns the char value at the specified index. An index ranges from 0 to length() - 1.
The first char value of the sequence is 
at index 0, the next at index 1,and so on, as for array indexing. 

If the char value specified by the index is a surrogate, the surrogate
value 
is returned.
Specified by:charAt in interface CharSequenceParameters:index - the index of the char value.Returns:the char value at the specified index of this string.The first char value is at index 0.
			  
			 * 
			 * 
			  
			 
			 *
			 * 
			 * */
			
			
			
			
			if(Character.isLowerCase(sentence.charAt(i)    )) 
			{
				System.out.print(sentence.charAt(i));
			}
			
		}
// Printing Spaces
		System.out.println("  ");
		System.out.println("  ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// FINDING TOTAL COUNT OF LETTERS/CHARACTERS/ALPHABETS
		
	
	for(int i=0;i<sentence.length();i++)
	{
		
		if(Character.isUpperCase(sentence.charAt(i)  ) ||  Character.isLowerCase(sentence.charAt(i))  ) 
		{
			count++;
			
		}
		
		
	}
	System.out.println("Total number of letters/characters/alphabets are  "+count);
	
	// Printing Spaces
			System.out.println("  ");
			System.out.println("  ");
			
			
			
	
			
			
			
			
			
			
			
			
			
			//NOW FINDING VOWELS	AND    SPECIAL CHARACTERS TOGETHER	
		
			
		
			
			
		// i have not taken <= because it will exceed the limit if i do that and i will get an exception
			//trying to apply exception handeling 
		
			
			
		
		for(int i =0 ; i<sentence.length() ; i++)
			
		{
			
			
			// i had used charAt because i want to brake my strings into characters
			ch= sentence.charAt(i);
			
			
			// this is for vowels
			
			// we can replace else if by OR 
if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'   )   
				
			{
	
	System.out.println(" Vowels present in our string are   "+ch);
	counter_for_vowels++;
				
			}





      // this is for special characters

// Special characters collected = '<', '(', '[', '{', '\\', '^', '-', '=', '$', '!', '|', ']', '}', ')', '?', '*', '+', '.', '>' 
// here you need to store the special characters what you want
// OR is also saving time instead of using nested if , nested if looks complex and takes more time 
else if(ch == '<' ||  ch == '(' || ch== '{' || ch== '[' || ch=='\\' || ch=='^' || ch=='-' || ch=='=' || ch=='$' || ch=='!' || ch=='|' || ch==']' || ch=='}' || ch==')' || ch=='?' || ch=='*' || ch=='+' || ch== '.' || ch== '>' || ch=='@' || ch=='`' || ch=='~')
{
	
	// Printing spaces

	System.out.println(" ");

	System.out.println(" Special characters present in our String are "+ch);
	counter_for_special_characters++;
}
			
			
			
			
			
			
			
			
		}
			//printing space
		System.out.println(" ");
		
		// Over here i had printed no of how many vowels present in our string 
		System.out.println(" Number Of vowels present in String are are "+counter_for_vowels);
			
		
		//Printing spaces and lines
		System.out.println(" ");
		
		// Over here i had printed no of how many special characters present in our string 
				System.out.println(" Number Of Special Characters present in String are  "+counter_for_special_characters);
	
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				// COUNTING TOTAL AMOUNT OF WORDS
		
				
				
				/*
		  
		 GUIDE TAKEN FROM STACK OVER FLOW 
		 
		 
		 The simplest way to get the answer is as follow:

public static void main(String[] args) {
    String string = "a.b.c.d";
    String []splitArray = string.split("\\.",-1);
    System.out.println("No of . chars is : " + (splitArray.length-1));
}
		 
		 
		 * */	
	
	
	String sentenceSpliter[] = sentence.split(" ");
	//printing new line
	System.out.println(" ");
	
	System.out.println("Number of words present in our sentence = "   +sentenceSpliter.length);
	
	//printing new line
		System.out.println(" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// NOW FINDING REPETATION OF ALPHABETS
		
		/* ager hum counter ko yehan pa zero initialize kr wain ga na to counter chle ga likan
		   wo rows and columns ko read kre ga */
		
		/*huma to column ko read kr wana ha */
		
		
		int counter_for_finding_alphabets_frequency; // counter for finding repetition of alphabets
		int i=sentence.length();
		
		
		char string_braker;
	// here it will read the ASCII characters from capital A to small z	
	for(char c='A'; c<='z';c++)  // row 
	{
		// yahe wejha ha k hum na yehan pa a k counter ko zero initialize kr waya ha 
		counter_for_finding_alphabets_frequency=0;
	for(int j=0 ;j<i;j++) // column
	{
		// here i had braked the String present in column j
		string_braker = sentence.charAt(j);
		
		
		// ager brake hu wa string character k braber ha to count kro 
		if(string_braker==c ) 
		{
			counter_for_finding_alphabets_frequency++;
		}
		
	}// column (2nd for loop) end here
	
	if(counter_for_finding_alphabets_frequency>0)
		
	{
		
		System.out.println("The alphabet  "+c+ " has comed  "+counter_for_finding_alphabets_frequency + " times");
	}
	
		
	}
	
	
	
	
	
	
	
	}
}
