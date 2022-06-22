//read principal, rate, and time. Then calculate simple interest and amount, and display it.

import java.io.*;

class SimpleInterest
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the principal, rate and time- ");
		int p=Integer.parseInt(br.readLine());
		float r=Float.parseFloat(br.readLine());
		float t=Float.parseFloat(br.readLine());
		float si=(p*t*r)/100;
		float a=p+si;
		System.out.println("Simple interest is "+si+" and amount is "+a);
	}
}