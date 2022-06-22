//threading

class ThreadDemo implements Runnable
{
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Running thread- "+t.getName());
	}

	public static void main(String[] args)
	{
		ThreadDemo td=new ThreadDemo();
		Thread t1=new Thread(td,"First");
		Thread t2=new Thread(td,"Second");
		Thread t3=new Thread(td,"Third");
		t1.start();
		t2.start();
		t3.start();
	}
}