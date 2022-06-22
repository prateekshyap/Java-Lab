//multiplication of two matrices of order 3X3.

import java.io.*;

class MatrixMultiply
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		//taking input
		int[][] num1=new int[3][3];
		int num2[][]=new int[3][3];
		System.out.println("Enter the numbers row wise for the first matrix- ");	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num1[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Enter the numbers row wise for the second matrix- ");	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num2[i][j]=Integer.parseInt(br.readLine());
			}
		}

		//printing the matrices
		System.out.println("Matrix 1- ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(num1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Matrix 2- ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(num2[i][j]+"\t");
			}
			System.out.println();
		}

		//multiplying the matrices
		int num3[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					num3[i][j]=num3[i][j]+num1[i][k]*num2[k][j];
				}
			}
		}

		//printing the matrix
		System.out.println("The matrix is- ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(num3[i][j]+"\t");
			}
			System.out.println();
		}
	}
}