import java.util.*;
class TestArrayList1
{
	public static void main(String args[]) 
	{
		ArrayList al = new ArrayList();
		System.out.println("Initial size of al: " + al.size());
		al.add(1);
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Size of al after additions: " + al.size());
		System.out.println("Contents of al: " + al);
		System.out.println("Deleted element "+al.remove("F"));
		//Integer i=new Integer(1);
		System.out.println("Deleted element "+al.remove(1));
		System.out.println("Size of al after Deletion: " + al.size());
		System.out.println("Contents of al: " + al);

	}
}