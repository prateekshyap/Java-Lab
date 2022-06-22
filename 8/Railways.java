//define a class called RailwayReservation
//with four instance variables (trainNumber, bogieNumber, berthNumber,
//passengerId), a method to set the variables and another method to display
//the variables.

import java.io.*;

class RailwayReservation
{
	int trainNumber, berthNumber;
	String bogieNumber, passengerId;
	void setVariables(int trnNo, String bogNo, int bthNo, String psngId)
	{
		trainNumber=trnNo;
		bogieNumber=bogNo;
		berthNumber=bthNo;
		passengerId=psngId;
	}
	void displayVariables()
	{
		System.out.println("Train number- "+trainNumber+"\nBogie number- "+bogieNumber+"\nBerth number- "+berthNumber+"\nPassenger ID- "+passengerId);
	}
}

class Railways
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		RailwayReservation rr=new RailwayReservation();
		System.out.println("Enter the train number- ");
		int tn=Integer.parseInt(br.readLine());
		System.out.println("Enter the bogie number- ");
		String bon=br.readLine();
		System.out.println("Enter the berth number- ");
		int ben=Integer.parseInt(br.readLine());
		System.out.println("Enter the passenger id- ");
		String pi=br.readLine();
		rr.setVariables(tn,bon,ben,pi);
		rr.displayVariables();
	}
}