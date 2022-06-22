//read ‘n’ numbers in an array. Then display all and print the biggest and smallest number.

import java.io.*;

class BigSmallArray
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		//taking input for the array
		System.out.println("Enter the dimension of the array- ");
		int rng=Integer.parseInt(br.readLine());
		int num[]=new int[rng];
		System.out.println("Enter the elements- ");
		for(int i=0;i<rng;i++)
			num[i]=Integer.parseInt(br.readLine());

		//printing the array
		System.out.println("The array is- ");
		for(int i=0;i<rng;i++)
			System.out.print(num[i]+" ");

		//finding out the biggest and the smallest number and printing them
		int big=num[0], small=num[0];
		for (int i=1;i<rng;i++)
		{
			if(num[i]>big) big=num[i];
			if(num[i]<small) small=num[i];
		}
		System.out.println("\nThe biggest and the smallest numbers are "+big+" and "+small);
	}
}