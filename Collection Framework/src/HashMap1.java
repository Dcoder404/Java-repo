import java.util.* ;

public class HashMap1 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> hm = new TreeMap<Integer,String> ();
		
		hm.put(101,"Ankur");
		hm.put(102,"Anushka");
		hm.put(103,"Ram");
		hm.put(104,"Rajat");
		hm.put(106,"Raj");
		hm.put(105,"Rat");
		hm.put(107,"Rajma");
		
		for(Map.Entry m:hm.entrySet())	{
			System.out.println(m.getKey() + " " +m.getValue());
		}
	}
}
