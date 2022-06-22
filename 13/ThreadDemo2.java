//threading

class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("This is a java program using thread.");
	}
}

class ThreadDemo2
{
	public static void main(String[] args)
	{
		MyThread mt=new MyThread();
		mt.run();
	}
}