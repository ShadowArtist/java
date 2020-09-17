//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}






interface iterable
{
	
	// ain generics k ander koi se bhe data type likahin ga 
	// datatype hone chyia ha ais k ander
	// and remember Boxed type datatypes will only come here primitive data types(int,double,long,short,boolean,char,float,byte) can not come over here 
	
// Remember we can not create Object of Iterator Because it is not a class . Objects are fromed only on iterator	
	
Iterator<Integer> iterator();
}


interface Collection extends iterable
{
	//E = datatype (boxed datatype)
	public boolean add();
	
	public boolean addAll();
	
	public boolean remove();
	
	public boolean removeAll();
	
	/*default*/ boolean RemoveIf();
	
	public boolean retainAll();
	
	public int size();
	public void clear();
	public boolean contains();
	public boolean containsAll();
	public Iterator iterator();
	
	
	//T,E = boxed types
	
	public <Integer> Integer[] toArray(Integer[] a);
	
	
	public boolean isEmpty();
	
	default Stream<Integer>parallelStream() {
		return null;
	}
	
	default Spliterator<Integer>spliterator() {
		return null;
	}
	
	public boolean equals();
	
	public int hashCode();
	
}


//interface child ha collection 
interface List extends Collection
{

	// ya ais tareka sa implement ho reha ha
	// koi se bhe data type ho skte ha likan khiyal reha k wo boxed datatype hone chyia ha 
	
   //java.util.List<Integer> list1 = new ArrayList();
   java.util.List<Integer> list2 = new LinkedList();
   java.util.List<Integer> list3 = new Vector();
   java.util.List<Integer> list4 = new Stack();

	
}




abstract class ArrayList implements List
{
	
}








