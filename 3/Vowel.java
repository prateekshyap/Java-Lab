//read a character. Then check the character is vowel or not.

import java.io.*;

class Vowel
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter a character- ");
		char ch=(char)System.in.read();
		if(ch=='A'||ch=='a')
			System.out.println("VOWEL");
		else if(ch=='E'||ch=='e')
			System.out.println("VOWEL");
		else if(ch=='I'||ch=='i')
			System.out.println("VOWEL");
		else if(ch=='O'||ch=='o')
			System.out.println("VOWEL");
		else if(ch=='U'||ch=='u')
			System.out.println("VOWEL");
		else
			System.out.println("NOT VOWEL");
	}
}