//define a class called numbers with two
//member variables of double kind, a method to assign member variables, and
//a method to display sum and difference of those two numbers.

import java.io.*;

class numbers
{
	double a, b;
	void assign(double a, double b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		double sum=a+b, dif=a-b;
		System.out.println("Sum- "+sum+"\nDifference- "+dif);
	}
}

class AddSubtract
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		numbers num=new numbers();
		System.out.println("Enter two numbers- ");
		double num1=Double.parseDouble(br.readLine());
		double num2=Double.parseDouble(br.readLine());
		num.assign(num1,num2);
		num.display();
	}
}