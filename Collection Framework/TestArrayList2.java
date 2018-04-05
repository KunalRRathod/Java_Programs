import java.util.*;
class TestArrayList2
{
	public static void main(String args[])
	{
		ArrayList <String> al=new ArrayList <String>();
		System.out.println(al.size());
		al.add("P");
		al.add("A");
		al.add("N");
		al.add("K");
		al.add("A");
		al.add("J");
		System.out.println(al);
		al.add(0,"Pankaj");
		System.out.println(al);
		System.out.println("Removed Element = "+al.remove(0));
		System.out.println(al);
	}
}