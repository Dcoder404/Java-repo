import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAll {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList <String> ();
		
		al.add("Rahul");
		al.add("Rajat");
		al.add("Arun");
		
		ArrayList <String> al2 = new ArrayList <String> ();
		
		al2.add("Rajat");
		al2.add("Himanshu");
		
		al.removeAll(al2);
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext())	{
			System.out.println(itr.next());
		}

	}

}
