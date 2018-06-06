class NewThread implements Runnable 
{
	String name; 
	Thread t;
	NewThread(String threadname) 
	{
		name = threadname;
		t = new Thread(this, name);
		System.out.println(name+" thread: " + t);
		t.start(); 
	}
	public void run() 
	{
		try 
		{
			for(int i = 1; i <= 5; i++) 
			{
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println(name + " Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
class MultiThreadDemo 
{
	public static void main(String args[]) 
	{
		new NewThread("One"); 
		new NewThread("Two");
		new NewThread("Three");
		try 
		{
			for(int i=1; i<=5;i++)
			{
				System.out.println("Main : "+i);
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}