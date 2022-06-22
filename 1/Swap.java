//swap two numbers 15 and 25

class Swap
{
	public static void main(String[] args)
	{
		int a=15, b=25;
		System.out.println("Before swapping- "+a+" and "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping- "+a+" and "+b);
	}
}