import java.util.*;
class TestSet1
{
	public static void main(String args[])
	{
		Set s1=new HashSet();
		s1.add("B");
		s1.add("E");
		s1.add("D");
		s1.add("A");
		s1.add("C");
		System.out.println("Hashset = "+s1);
		
		Set s2=new TreeSet(s1);
		//s2.addAll(s1);
		System.out.println("Treeset = "+s2);
	}
}