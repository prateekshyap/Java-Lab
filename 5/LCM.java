//read two numbers. Then display the LCM.

import java.io.*;

class LCM
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);	
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter two positive integers- ");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int x=a, y=b;
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		int lcm=(x*y)/a;
		System.out.println("LCM is "+lcm);
	}
}