//print the Fibonacci series 0 1 1 2 3 5 ……… n.

import java.io.*;

class Fibonacci
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int a=0, b=1;
		int c=a+b;
		System.out.println("Enter the range- ");
		int rng=Integer.parseInt(br.readLine());
		System.out.println(a+"\n"+b);
		while(c<=rng)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}