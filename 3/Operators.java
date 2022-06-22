//read an arithmetic character. Then display the operator name.

import java.io.*;

class Operators
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter an arithmetic character- ");
		char ch=(char)System.in.read();
		if(ch=='+')
			System.out.println("Addition");
		else if(ch=='-')
			System.out.println("Subtraction");
		else if(ch=='*')
			System.out.println("Multiplication");
		else if(ch=='/')
			System.out.println("Division");
		else if(ch=='%')
			System.out.println("Modulus");
		else
			System.out.println("Wrong input");
	}
}