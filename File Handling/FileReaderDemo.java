import java.io.*;
class FileReaderDemo
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr=new FileReader("C:/Pankaj/File/BRRead.java");
		BufferedReader br= new BufferedReader(fr);
		String str;
		do
		{
			str = br.readLine();
			if(str!=null)
			{
				System.out.println(str);
			}
		}
		while(str!=null);
		fr.close();
	}
}