//read two numbers. Then display the numbers and display the swapped numbers.

import java.io.*;

class Swap
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter two numbers- ");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		System.out.println("Before swapping- "+a+" and "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping- "+a+" and "+b);
	}
}