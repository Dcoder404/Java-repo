
public class FinallyBlock2 {

	public static void main(String args[])	{
		
		try	{
			
			int data = 45 / 0;
			System.out.println(data);
		}
		catch(NullPointerException e)	{
			System.out.println(e);
		}
		finally	{
			System.out.println("Finally block is always executed.");
		}
		
	System.out.println("Remaining Code");
		
	}
	
}
