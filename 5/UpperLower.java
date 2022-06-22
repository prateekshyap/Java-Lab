//read a string. Then count total number of uppercase and lowercase alphabets.

import java.io.*;

class UpperLower
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter a String- ");
		String temp=br.readLine();	
		int len=temp.length();
		char[] ch=new char[len];
		for(int i=0;i<len;i++)
			ch[i]=temp.charAt(i);
		int up=0, low=0;
		for(int i=0;i<len;i++)
		{
			if((int)ch[i]>=65&&(int)ch[i]<=90)
				up++;
			else if((int)ch[i]>=97&&(int)ch[i]<=122)
				low++;
		}
		System.out.println("Upper case characters- "+up+"\nLower case characters- "+low);
	}
}