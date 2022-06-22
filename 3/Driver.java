//read the age of a driver. Then display
//the license fees accordingly:
//Age Fees
//50 – 60 Rs. 1000/-
//40 – 49 Rs. 1500/-
//30 – 39 Rs. 2000/-
//18 – 29 Rs. 3000/-

import java.io.*;

class Driver
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the age of the driver- ");
		int age=Integer.parseInt(br.readLine());
		if(age>=18&&age<=29)
			System.out.println("Rs. 3000/-");
		else if(age>=30&&age<=39)
			System.out.println("Rs. 2000/-");
		else if(age>=40&&age<=49)
			System.out.println("Rs. 1500/-");
		else if(age>=50&&age<=60)
			System.out.println("Rs. 1000/-");
		else
			System.out.println("Invalid input");
	}
}