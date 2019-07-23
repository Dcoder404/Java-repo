
public class ThreadClass extends Thread {			//predefined class Thread
	
	public void run()	{				//run overloaded
		System.out.println("Task is executing.");
	}
	
	public static void main(String args[])	{
		ThreadClass obj = new ThreadClass();
		obj.start();
	}
	
}
