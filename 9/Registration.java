//super keyword.

import java.io.*;

class CommonPart
{
	void show()
	{
		System.out.print("1601105");
	}
}

class DifferentPart extends CommonPart
{
	int reg;
	void assign(int r)
	{
		reg=r;
	}
	void show()
	{
		super.show();
		if(reg<100)
			System.out.println("0"+reg);
		else
			System.out.println(reg);
	}
}

class Registration
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		DifferentPart dp=new DifferentPart();
		System.out.println("Enter the last 2 or 3 digits of your registration number- ");
		int regd=Integer.parseInt(br.readLine());
		dp.assign(regd);
		dp.show();
	}
}