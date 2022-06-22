//print the number and its factorial from
//0 to 10 in the given format:
//0! = 1
//1! = 1
//2! = 2
//…….

class Factorial
	{
	public static void main(String args[])
		{
		System.out.println("0!=1");
		for(int num=1;num<=10;num++)
			{
			int fac=1;
			for(int j=1;j<=num;j++)
				{
				fac=fac*j;
				}
			System.out.println(num+"!="+fac);
			}
		}
	}