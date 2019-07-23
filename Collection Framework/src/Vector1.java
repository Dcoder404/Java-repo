import java.util.* ;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String> ();  // creating vector.
		
		v.add("Umesh");		// method of vector.
		v.add("Rajesh");
		v.add("Iftkar");
		v.add("Khan");

		// traversing elements using Enumeration.
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())	{
			System.out.println(e.nextElement());
		}

	}

}
