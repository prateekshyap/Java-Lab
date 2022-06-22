//read temperature in degree. Then change into Fahrenheit and display it.

import java.io.*;

class C_to_F
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the temperature celcius- ");
		float c=Float.parseFloat(br.readLine());
		double f=(c*1.8)+32;
		System.out.println("Fahrenheit temperature is- "+f);
	}
}