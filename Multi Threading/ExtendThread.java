class NewThread extends Thread 
{
	NewThread() 
	{
		super("Demo Thread");
		System.out.println("Demo thread: " + this);
		start();
	}
	public void run() 
	{
		try 
		{
			for(int i = 1; i <= 5; i++) 
			{
				System.out.println("Demo Thread: " + i);
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Demo Thread interrupted.");
		}
		System.out.println("Exiting Demo Thread.");
	}
}
class ExtendThread 
{
	public static void main(String args[]) 
	{
		new NewThread(); 
		try 
		{
			for(int i = 1; i <=5; i++) 
			{
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}