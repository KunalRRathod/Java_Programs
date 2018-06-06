class CurrentThreadDemo1 
{
	public static void main(String args[]) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		t.setName("My Thread");
		System.out.println("After name change: " + t);
		System.out.println("Priority : "+ t.getPriority());
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("After Priority Change : "+ t.getPriority());
		System.out.println("After Priority change: " + t);
		System.out.println("name : "+ t.getName());
		System.out.println("is alive: "+t.isAlive());
		System.out.print("Thread Program ");
		try
		{
			t.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("is End now :-) ");
		}
	}
}