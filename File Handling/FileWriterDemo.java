import java.io.*;
class FileWriterDemo
{
	public static void main(String args[]) throws IOException
	{
		String str;
		FileWriter fw;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			fw=new FileWriter("C:/Pankaj/file/FileWrite.txt");
		}
		catch(IOException e)
		{
			System.out.println("can not open file");
			return;
		}
		System.out.println("Enter text, pass 'stop' to quit :");
		do
		{
			str=br.readLine();
			if(str.equals("stop") )
			break;
			str=str+" ";
			fw.write(str);
		}
		while(!str.equals("stop") );
		fw.close();
	}		
}