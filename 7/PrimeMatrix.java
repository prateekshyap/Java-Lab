//read rXc numbers in a matrix. Then display the matrix. And display all the prime numbers without changing its original position in the matrix.

import java.io.*;

class PrimeMatrix
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		//taking input
		System.out.println("Enter the number of rows- ");
		int r=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of columns- ");
		int c=Integer.parseInt(br.readLine());
		int num[][]=new int[r][c];
		System.out.println("Enter the numbers row wise- ");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				num[i][j]=Integer.parseInt(br.readLine());

		//printing the matrix
		System.out.println("The matrix is- ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}

		//checking for the prime numbers and printing the matrix
		System.out.println("The prime numbers are- ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				int check=checkPrime(num[i][j]);
				if(check==1)
					System.out.print(num[i][j]+"\t");
				else if(check==0)
					System.out.print("\t");
			}
			System.out.println();
		}
	}

	//checking for prime number
	static int checkPrime(int x)
	{
		int flag=0, primeChecker=0;
		for(int k=2;k<x;k++)
		{
			if(x%k==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0&&x!=1)
			primeChecker=1;
		else
			primeChecker=0;
		return primeChecker;
	}
}