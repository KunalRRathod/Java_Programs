import java.io.*;
public class CopyFiles
{
        	public static void main(String arg[]) throws IOException 
	{
		int i=0;
		FileOutputStream fos=null;
		FileInputStream fin=null;
	try{
    		try		
		{
			fin= new FileInputStream("D:\\Pankaj\\File\\BRRead.java");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		try
		{
			fos=new FileOutputStream("D:\\Pankaj\\First1.java",true);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("usage: ShowFile File");
			return;
		}
		try
		{
			do
			{
				i=fin.read();
				if(i!=-1)
				fos.write(i);		
			}
			while(i!=-1);
	        	}
		catch(IOException e)
		{
			System.out.println(e);
		}
		fin.close();
		fos.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}