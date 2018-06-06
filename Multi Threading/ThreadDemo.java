class NewThread implements Runnable
{
	Thread t;
	NewThread() 
	{
		t = new Thread(this, "Demo Thread");
		System.out.println("Demo Thread: " + t);
		t.start();
	}
	public void run() 
	{
		try 
		{
			for(int i = 1; i <= 5; i++) 
			{
				System.out.println("Demo Thread: " + i);
				t.sleep(1000);
			}
		}
		catch (InterruptedException e) 
		{	
			System.out.println("Demo Thread interrupted.");
		}
		System.out.println("Exiting Demo Thread.");
	}
}
class ThreadDemo 
{
	public static void main(String args[]) 
	{
		NewThread ob1=new NewThread();
		try 
		{
			for(int i = 1; i <=5 ; i++) 
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