//read name of the student, roll, and marks in four subjects. 
//Display name, roll, total and average marks in the
//given format:
//Name:
//Roll:
//Total Marks:
//Average Marks:

import java.io.*;

class StudentDetails
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the name- ");
		String name=br.readLine();
		System.out.println("Enter the roll no- ");
		int roll=Integer.parseInt(br.readLine());
		System.out.println("Enter the marks of four subjects- ");
		int m1=Integer.parseInt(br.readLine());
		int m2=Integer.parseInt(br.readLine());
		int m3=Integer.parseInt(br.readLine());
		int m4=Integer.parseInt(br.readLine());
		float avg=(float)(m1+m2+m3+m4)/4;

		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Total Marks: 400");
		System.out.println("Average Marks: "+avg);
	}
}