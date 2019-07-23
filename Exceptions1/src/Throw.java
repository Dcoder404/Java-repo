
public class Throw {
	
	static void validate(int age)	{
		
		if (age < 21)	{
			throw new ArithmeticException("Not valid");
		}
		else	{
			System.out.println("Eligible for marriage");
		}	
	}
	
	public static void main(String args[])	{
		
		validate(18);
		System.out.println("Remaining code");
		
	}

}
