import java.util.* ;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> hm = new Hashtable<Integer,String> ();
		
		hm.put(100,"Änkur");
		hm.put(101,"Chandragupta");
		hm.put(106,"Raman");
		hm.put(103,"Raj");
		hm.put(104,"Rajat");
		hm.put(102,"Anand");
		
		for (Map.Entry m:hm.entrySet())	{
			System.out.println(m.getKey() + " " +m.getValue());
		}

	}

}
