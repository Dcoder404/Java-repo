import java.util.*;

public class ForEachLoop {

	public static void main(String[] args) {

		ArrayList <String> arraylist1 = new ArrayList <String> ();

		arraylist1.add("Rahul");
		arraylist1.add("Vihan");
		arraylist1.add("Rajat");
		arraylist1.add("Vikas");
		arraylist1.add("Raman");
		arraylist1.add("Vihan");

		for(String object1 : arraylist1)
			System.out.println(object1);
	}

}
