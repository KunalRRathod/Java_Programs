import java.util.*;
class TestArrayList3
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
		ArrayList <String> al2=new ArrayList <String>();
		System.out.println(al2.size());

		al2.add("XYZ");
		al2.addAll(0,al);

	//	al2.addAll(al);
		System.out.println("al2= "+al2);
		System.out.println(al2.size());	
		al2.add("Hello");
		al2.add("Java");
		System.out.println("al2= "+al2);
		System.out.println(al2.size());
		System.out.println(al2.containsAll(al));
	}
}