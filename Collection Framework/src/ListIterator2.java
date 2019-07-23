import java.util.*;
public class ListIterator2 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Amit");
		al.add("Vihan");
		al.add("Kiran");
		al.add(1,"Sohan");     // sohan will be added at 1st position and elements will be shifted

		System.out.println("Ëlement at second position : " +al.get(2));
		
		ListIterator<String> itr  = al.listIterator();
		
		System.out.println("Traversing elements in forward direction:");
		
		while(itr.hasNext())	{
			System.out.println(itr.next());
		}
		
		System.out.println("Traversing elements in backward direction:");
		
		while (itr.hasPrevious())	{
			System.out.println(itr.previous());
		}
	}

}
