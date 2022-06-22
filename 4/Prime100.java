//display all the prime numbers from 1 to 100.
import java.util.Scanner;
class Prime100
	{
	public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		for(int count=2;count<=100;count++)
			{
			int flag=0;
			for(int i=2;i<=count-1;i++)
				{
				if(count%i==0)
					{
					flag=1;
					break;
					}
				}
			if(flag==0)
				{
				System.out.println(count);
				}
			}
		System.out.println("The above are the prime numbers from 1 to 100");
		}
	}