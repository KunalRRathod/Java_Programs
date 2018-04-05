import java.io.*;

class ReadLines
{
	public static void main(String args[]) throws IOException
	{
		String str;
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter a line of Strings, pass 'stop' to quite :");
		do 
		{
			str = br.readLine();		
			System.out.println(str);
		} 
		while(!str.equals("stop"));
	}
}