import java.io.IOException;


public class Throws {
	
	void m() throws IOException	{
		
		throw new IOException("Exception thrown");    //checked exception.
	}

	void n() throws IOException	{
		m();
	}
	
	void p()	{
		try	{
			n();
		}
		catch(Exception e)	{
			System.out.println("Exception handled");
		}
	}
	
	public static void main(String args[])	{
		
		Throws obj = new Throws();
		
		obj.p();
		
		System.out.println("Remaining code");
	}
	
}
