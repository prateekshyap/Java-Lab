//multiple tasks using single thread

class MultiTask implements Runnable
{
	int a=20,b=5,c=0;
	public void run()
	{
		add();
		subtract();
		multiply();
		divide();
	}

	public static void main(String[] args)
	{
		MultiTask mt=new MultiTask();
		Thread t=new Thread(mt,"Multi");
		t.start();
	}

	void add()
	{
		c=a+b;
		System.out.println("Sum- "+c);
	}

	void subtract()
	{
		c=a-b;
		System.out.println("Difference- "+c);
	}

	void multiply()
	{
		c=a*b;
		System.out.println("Product- "+c);
	}

	void divide()
	{
		c=a/b;
		System.out.println("Quotient- "+c);
	}
}