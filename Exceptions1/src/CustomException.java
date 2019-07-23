
public class CustomException {

	static void validate1(int age) throws InvalidAgeException	{
	
		if (age < 18)	{
			throw new InvalidAgeException("not valid");
		}
		else	{
			System.out.println("Welcome to Voting Portal");
		}
	
	}
	
	public static void main(String args[])	{
		
		try	{
			validate1(12);
		}
		catch(Exception m)	{
			System.out.println("Exception occured : " +m);
		}
		
		System.out.println("Remaining code");
		
	}
	
}
