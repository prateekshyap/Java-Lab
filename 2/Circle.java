//read radius of the circle. Then calculate area and circumference, and display it.

import java.io.*;

class Circle
{
	static final float PI=3.14f;
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the radius of the circle- ");
		float r=Float.parseFloat(br.readLine());
		float c=2*PI*r;
		float a=PI*r*r;
		System.out.println("The circumference is "+c+" and the area is "+a);
	}
}