import java.io.*;

class ByteShowFile 
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fin;
		try 
		{
			//File file = new File("C:/Pankaj/File/BRRead.java");
			//fin = new FileInputStream(file);

			fin = new FileInputStream("C:/pankaj/file/BRRead.java");
		} 
		catch(FileNotFoundException e) 
		{
			System.out.println("File Not Found");
			return;
		} 

		// read characters until EOF is encountered
		do 
		{
			i = fin.read();
			if(i != -1) 
			{
				System.out.print((char) i);
			}	
		} 
		while(i != -1);
		fin.close();
	}
}