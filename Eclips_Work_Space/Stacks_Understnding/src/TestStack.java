/*A stack stores data using first in last out ordering.That is a stack,
 * 
 * like for example a stack of plates on a table the first plate put down on the table
 * is the last plate to be used . 
 * 
 * Stacks are controlled by two operations tradationally called push and pop 
 * 
 * 
 * to put an item on the top of the stack you use push
 * 
 * to remove an item from the top of the stack you use pop
 * 
 * */

//Stack class comes in java util folder 
import java.util.*;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ya wala asan ha book main mushkil tha 
		
		// this is how we create a stack
Stack<String> stackOfCards = new Stack<>();

stackOfCards.push("Jack");
stackOfCards.push("Queen");
stackOfCards.push("King");
stackOfCards.push("Ace");

System.out.println("Stack before poped : ");
// we also can use for each loop in stacks 
for(String list : stackOfCards) 
{
	System.out.println("  "+list);	
}



// card at top ka  aik variable bna ya aus main sa stackOfCards pa aik method lga dia pop ka jo aupar sa aik value hta de ga


/*ku ka jub hum platain rekhta hain to jo plate akhir  main rakhe hote ha wo plate sub sa pehla nikelte ha */

/*Last wala item first Item ho ga stack Main*/

/*tbhe ais main last wala item pehla pop ho ga */

System.out.println();




String card_at_top = stackOfCards.pop();
System.out.println("Stack which is popped  "+card_at_top);


System.out.println();


System.out.println("Stack After Popped :");
for(String list : stackOfCards)
{
	System.out.println("  "+list);	
}


	}

}
 




/*VERY SIMPLE EXAMPLE TAKEN FROM https://www.callicoder.com/java-stack/ 
 * 
 * PRACTICE IT
 * 
 * 
 * import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stackOfCards = new Stack<>();

        // Pushing new items to the Stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack => " + stackOfCards);
        System.out.println();

        // Popping items from the Stack
        String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();

        // Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);

    }
}
 *
 * 
 * 
 * */















// this class defines an integer stack that can hold 10 values

/*
 * plate1         index 0
 * plate2         index 1
 * plate3         index 2
 * plate4         index 3
 * plate5         index 4
 * plate6         index 5
 * plate7         index 6
 * plate8         index 7
 * plate9         index 8
 * plate10        index 9
 * 
 * */

