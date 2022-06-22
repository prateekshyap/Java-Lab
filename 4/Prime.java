//read a number and check prime or not.
import java.util.Scanner;
class Prime
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is prime or not-");
		int n=sc.nextInt();
		int flag=0, p;
		p=n;
		for(int i=2;i<p/2;i++)
			{
			if(n%i==0)
				{
				flag++;
				break;
				}
			}
		if(flag==0)
			System.out.println("The entered number is prime.");
		else
			System.out.println("The entered number is not prime.");
		}
	}