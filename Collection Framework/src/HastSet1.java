import java.util.*;
public class HastSet1 {

	public static void main(String[] args) {
		
		TreeSet<String> al = new TreeSet<String>();
		
		al.add("Rahul");
		al.add("Raj");
		al.add("Raj");
		al.add("Raman");
		al.add("Rajat");
		al.add("Ravi");
		//al.add(null);
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())	{
			System.out.println(itr.next());
		}

	}

}
