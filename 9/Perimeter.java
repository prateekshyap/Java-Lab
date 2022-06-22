//constructor overloading

import java.io.*;

class Shape
{
	int l, b;
	Shape(int l, int b)
	{
		this.l=l;
		this.b=b;
		int p=2*(l+b);
		System.out.println("Perimeter- "+p);
	}
	Shape(int s)
	{
		l=s;
		int p=4*l;
		System.out.println("Perimeter- "+p);
	}
}

class Perimeter
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter 1 for rectangle and 2 for square- ");
		int num=Integer.parseInt(br.readLine());
		if(num==1)
		{
			System.out.println("Enter the length and breadth of the rectangle- ");
			int l=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
			Shape rec=new Shape(l,b);
		}
		else if(num==2)
		{
			System.out.println("Enter the side of the square- ");
			int s=Integer.parseInt(br.readLine());
			Shape sq=new Shape(s);
		}
		else
			System.out.println("Invalid input! Please try again!");
	}
}