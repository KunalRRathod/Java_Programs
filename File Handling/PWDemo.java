import java.io.*;

class PWDemo
{
	public static void main(String args[])
	{
		PrintWriter pw = new PrintWriter(System.out,true);
		int i=10;
		double d=123.23;
		pw.println("Using a PrintWriter");
		pw.println(i);
		pw.println(d);
	//	pw.flush();
	}
}