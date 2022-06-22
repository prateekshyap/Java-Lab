//read ‘n’ employees name, gender, post, and salary in an array of object. Then display all the details.

import java.io.*;

class Employee
{
	String name, gen, post;
	Double sal;
	Employee(String name,String gen,String post,double sal)
	{
		this.name=name;
		this.gen=gen;
		this.post=post;
		this.sal=sal;
	}
	void display()
	{
		System.out.println("NAME: "+name+"\nGENDER: "+gen+"\nPOST: "+post+"\nSALARY: "+sal+"\n");
	}
}

class EmployeeArray
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of employees- ");
		int dim=Integer.parseInt(br.readLine());
		Employee emp[]=new Employee[dim];

		//assigning
		for(int i=0;i<dim;i++)
		{
			System.out.println("Enter the name- ");
			String n=br.readLine();
			System.out.println("Enter the gender- ");
			String g=br.readLine();
			System.out.println("Enter the post- ");
			String p=br.readLine();
			System.out.println("Enter the salary- ");
			Double s=Double.parseDouble(br.readLine());
			Employee temp=new Employee(n,g,p,s);
			emp[i]=temp;
		}

		//printing
		for(int i=0;i<dim;i++)
		{
			int x=i+1;
			System.out.println(x+" employee details- ");
			emp[i].display();
		}
	}
}