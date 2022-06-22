//Interface

interface A
{
	final static int a=12;
	final static int b=18;
}

interface B
{
	void add();
}

interface C
{
	void sub();
}

class Demo implements A,B,C
{
	int c;
	public void add()
	{
		c=a+b;
		System.out.println("addition- "+c);
	}
	public void sub()
	{
		c=b-a;
		System.out.println("subtraction- "+c);
	}
}

class InterfaceDemo
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.add();
		d.sub();
	}	
}