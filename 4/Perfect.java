//read a number and check perfect or not.

import java.io.*;

class Perfect
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter a number- ");
		int num=Integer.parseInt(br.readLine());
		int sum=1;
		for(int i=2;i<num;i++)
		{
			while(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
			System.out.println("Perfect");
		else
			System.out.println("Not perfect");
	}
}