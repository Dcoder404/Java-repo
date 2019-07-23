
public class MultipleCatch {

	public static void main(String[] args) {
		
		try	{
			int a[] = new int[5];
			a[5] = 60 / 0;
		}
		
		catch(ArithmeticException e)	{
			System.out.println("Good");
		}
		catch(ArrayIndexOutOfBoundsException e)	{
			System.out.println("Very Good");
		}
		catch(Exception e)	{
			System.out.println("Not Good");
		}
		
		System.out.println("Remaining Code");

	}

}
