
public class SleepThread extends Thread {

		public void run()	{
			
			for(int i = 1; i < 8; i++)	{
				try	{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)	{
					System.out.println(e);
				}
				
			System.out.println(i);	
			}
			
		}

	public static void main(String args[])	{
		
		SleepThread obj1 = new SleepThread();
		SleepThread obj2 = new SleepThread();
		
		obj1.start();
		obj2.start();
		
		/* we don't use run methods as it treats**/ 
		/* the program as normal program and *****/
		/* NOT as a thread.***********************/		
		
	}

}
