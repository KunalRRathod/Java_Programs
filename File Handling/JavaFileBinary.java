import java.io.*;

public class JavaFileBinary 
{
        	public static void main(String arg[]) throws Exception 
	{
		char[] arr1 = {'I','n','d','o','r','e' };
	              	int[] arr2 = { 65, 66, 67, 68, 69,3 };
	             	File file = new File("C:\\Pankaj\\NewFile1.txt");
                		FileOutputStream fos = new FileOutputStream(file);
                		DataOutputStream dos = new DataOutputStream(fos);
		
                		for (int i = 0; i < arr1.length; i++) 
		{
                        		dos.writeChar(arr1[i]);
                        		dos.writeInt(arr2[i]);
                		}
	                	dos.close();
        	}
  }