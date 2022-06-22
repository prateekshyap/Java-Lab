//A B C D
//E F G H
//I J K L
//M N O P

class Table1
{
	public static void main(String[] args)
	{
		int x=65;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print((char)x+"\t");
				x++;
			}
			System.out.println();
		}
	}
}