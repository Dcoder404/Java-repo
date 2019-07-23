
public class RunnableInterface implements Runnable {

	public void run()	{
		System.out.println("Task is executing.");
	}
	
	public static void main(String args[])	{
		
		RunnableInterface obj1 = new RunnableInterface();
		// made an object of this class.
		
		Thread t1 = new Thread(obj1);    //passed obj1 to thread class to make new object.
		
		t1.start();
		
	}
		
}
