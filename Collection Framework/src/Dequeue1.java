import java.util.*;

public class Dequeue1 {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.offer("Kuldeep");
		deque.offer("Kulwant");
		deque.offer("Kulwinder");
		deque.add("Mukta");     //same as offer
		deque.offerFirst("Rajesh");
		
		System.out.println("After offerFirst traversal ...");
		
		for(String s:deque)	{
			System.out.println(s);
		}
		
		//deque.poll();
		//deque.pollFirst();   - same as poll().
		
		deque.pollLast();
		
		System.out.println("After pollLast() Traversal ...");
		
		for(String s:deque)	{
			System.out.println(s);
		}

	}

}
