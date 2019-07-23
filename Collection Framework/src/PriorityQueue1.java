import java.util.*;

public class PriorityQueue1 {

	public static void main(String[] args) {
	
		PriorityQueue<String> queue = new PriorityQueue<String> ();
		
		queue.add("Amay");
		queue.add("Vihan");
		queue.add("Karan");
		queue.add("Jaimala");
		queue.add("Ramya");
		
		// The input order in queue is not maintained.
		
		// queue.element and queue.peek work same ie. to return first element
		System.out.println("head : " +queue.element());
		System.out.println("head : " +queue.peek());
		
		
		System.out.println("Iterating the queue elements :");
		
		Iterator itr = queue.iterator();
		while(itr.hasNext())	{
			System.out.println(itr.next());
		}

		// queue.remove and queue.poll work same.
		
		queue.remove();
		queue.poll();
		
		System.out.println("After removing two elements : ");
		
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext())	{
			System.out.println(itr2.next());
		}
			
	}

}
