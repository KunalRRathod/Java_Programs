import java.util.*;
class TestTree1
{
	public static void main(String args[])
	{
		TreeSet <Integer> ts1=new TreeSet <Integer>();
		ts1.add(60);
		ts1.add(70);
		ts1.add(50);
		ts1.add(35);
		ts1.add(45);
		ts1.add(99);
		ts1.add(50);
		System.out.println(ts1);
		System.out.println("Number Of Elements =  "+ts1.size());
	}
}