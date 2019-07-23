
public class JoinMethod extends Thread {
	
	public void run()	{
		
		for(int i = 1; i < 8; i++)	{
			
			try	{
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		System.out.println(i);
		}
	
	}
	
	public static void main(String args[])	{	
	
		JoinMethod obj1 = new JoinMethod();
		JoinMethod obj2 = new JoinMethod();
		JoinMethod obj3 = new JoinMethod();
		
		obj1.start();
		
		try	{
			obj1.join();
		}
		catch(Exception e)	{
			System.out.println(e);
		}
		
		obj2.start();
		
		obj3.start();
	}

}
