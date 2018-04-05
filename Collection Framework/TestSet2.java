import java.util.*;
class TestSet2
{
	public static void main(String args[])
	{
		// Set <String> hs1=new HashSet <String>(); 	//(Not an error)
		HashSet <String> hs1=new HashSet <String>();
		hs1.add("B");
		hs1.add("D");
		hs1.add("C");
		hs1.add("A");
		hs1.add("E");
		System.out.println(hs1);
		TreeSet <String> ts1=new TreeSet <String>(hs1);
		System.out.println(ts1);
	}
}