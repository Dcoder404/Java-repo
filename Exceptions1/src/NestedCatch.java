
public class NestedCatch {

	public static void main(String[] args) {
		
		try	{
			try	{
				System.out.println("Division has to be done.");
				int b = 78 / 0;
			}
			catch(ArithmeticException e)	{
				System.out.println(e);
			}
			
			
			try	{
				int a[] = new int[5];
				a[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e)	{
				System.out.println(e);
			}
			
			System.out.println("Display Something");
		}
		
		catch(Exception e)	{
			System.out.println("Handled");
		}
	
	System.out.println("Remaining code");
	}

}
