import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();	//creating arraylist.
		
		al.add("Rohit");		// adding objects in list.
		al.add("Vihan");
		al.add("Rohit");
		al.add("Arun");
		al.add("Rajat");
		
		Iterator itr = al.iterator(); 	//getting iterator from arraylist to traverse elements.
		
		while(itr.hasNext())	{
			System.out.println(itr.next());
		}

	}

}
