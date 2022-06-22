//Single Inheritance

class A
{
	void display()
	{
		System.out.println("I am in base class");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("I am in derived class");
	}
}

class SingleInheritance
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.display();
		ob.show();
		ob.show();
		ob.display();
	}
}