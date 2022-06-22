//read a month number. Then display number of days

import java.io.*;

class Months
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the month number accordingly\n1-January\n2-february\n3-March\n4-April\n5-May\n6-June\n7-July\n8-August\n9-September\n10-October\n11-November\n12-December");
		int num=Integer.parseInt(br.readLine());
		if(num==1||num==3||num==5||num==7||num==8||num==10||num==12)
			System.out.println("31 days");
		else if(num==4||num==6||num==9||num==11)
			System.out.println("30 days");
		else if(num==2)
			System.out.println("28 days");
		else
			System.out.println("Invalid input");
	}
}