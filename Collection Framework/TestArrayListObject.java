import java.util.*;
class TestArrayListObject
{
	public static void main(String args[])
	{
		ArrayList <Object> al=new ArrayList <Object>();
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
		al.add(1,1);
		System.out.println(al);
	}
}