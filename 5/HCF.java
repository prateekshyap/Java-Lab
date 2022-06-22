//read two numbers. Then display the HCF.

import java.io.*;

class HCF
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);	
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter two positive integers- ");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		System.out.println("HCF is "+a);
	}
}