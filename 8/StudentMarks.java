//define a class called StudentRec with two
//instance variable (regNumber, testMarks), a method setRegTestMarks()
//to assign regNumber and testMarks and another method displayDetails() to
//display the variables .

import java.io.*;

class StudentRec
{
	private int regNumber, testMarks;
	void setRegTestMarks(int r, int m)
	{
		regNumber=r;
		testMarks=m;
	}
	void displayDetails()
	{
		System.out.println("Regd no- "+regNumber+"\nTest marks- "+testMarks);
	}
}

class StudentMarks
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		StudentRec sr=new StudentRec();
		System.out.println("Enter the registration number- ");
		int regd=Integer.parseInt(br.readLine());
		System.out.println("Enter the test marks- ");
		int marks=Integer.parseInt(br.readLine());
		sr.setRegTestMarks(regd,marks);
		sr.displayDetails();
	}
}