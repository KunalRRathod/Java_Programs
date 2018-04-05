import java.io.*;

class MyClass implements Serializable
{
	transient String name="Pankaj";
	String s;
	int i;
	double d;
	public MyClass(String s, int i, double d) 
	{
		this.s = s;
		this.i = i;
		this.d = d;
	}
	public String toString() 
	{
		return "s=" + s + ", i=" + i + ", d=" + d +" Name = "+name;
	}
}
public class SerializationDemo 
{
	public static void main(String args[]) 
	{
		// Object serialization
		try 
		{
			MyClass object1 = new MyClass("Hello", -7, 1.2345);
			System.out.println("object1: " + object1);
			FileOutputStream fos = new FileOutputStream("C:/Pankaj/File/seriel.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		}
		catch(Exception e) 
		{
			System.out.println("Exception during serialization: " + e);
			System.exit(0);
		}
		// Object deserialization
		try 
		{
			MyClass object2;
			FileInputStream fis = new FileInputStream("C:/Pankaj/File/seriel.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object2 = (MyClass)ois.readObject();
			ois.close();
			System.out.println("object2: " + object2);
		}
		catch(Exception e) 
		{
			System.out.println("Exception during deserialization: " + e);
			System.exit(0);
		}
	}
}