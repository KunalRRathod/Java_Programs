class CurrentThreadDemo 
{
	public static void main(String args[]) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		t.setName("My Thread");
		System.out.println("After name change: " + t);
		try 
		{
			for(int i = 1; i <= 5; i++) 
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Main thread interrupted");
		}
		System.out.println("Bye");
	}
}