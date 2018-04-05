import java.io.*;
class ReadBytes 
{	
	public static void main(String args[]) throws IOException
	{
		byte data[]=new byte[10];
		System.out.println("Enter characters");
		System.in.read(data);
		System.out.println("You have entered");
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]+" = "+(char)(data[i]));
		}
	}
}