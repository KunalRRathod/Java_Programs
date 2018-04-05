import java.io.*;

class ByteCopyFile 
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		try 
		{
	// open input file
			try 
			{
				fin = new FileInputStream("C:/Pankaj/File/BRRead.java");
			} 
			catch(FileNotFoundException e) 
			{
				System.out.println("Input File Not Found");	
				return;
			}
		// open output file
			try 
			{
				fout = new FileOutputStream("C:/Pankaj/file/Pankaj.txt",true);
			} 
			catch(FileNotFoundException e) 
			{
				System.out.println("Error Opening Output File");
				return;
			}
		} 
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Usage: CopyFile From To");
			return;
		}
	// Copy File
		try 
		{
			do 
			{
				i = fin.read();
				if(i != -1) 
				{
					fout.write(i);
				}
			} 
			while(i != -1);
		} 
		catch(IOException e) 
		{
			System.out.println("File Error");
		}
		finally
		{
			fin.close();
			fout.close();
		}
	}
}