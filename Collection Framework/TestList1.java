import java.util.*;

public class TestList1 
{
  	public static void main(String args[]) 
	{
    		List list = new ArrayList();
		list.add("Indore");
    		list.add("Bhopal");
    		list.add("Ujjain");
    		list.add("Dewas");
    		list.add("Dhar");
    		System.out.println(list);
    		System.out.println("2: " + list.get(2));
    		System.out.println("0: " + list.get(0));
    		
		LinkedList queue = new LinkedList();
    		queue.addLast("Indore");
    		queue.addLast("Bhopal");
    		queue.addLast("Ujjain");
    		queue.addLast("Dewas");
    		queue.addLast("Dhar");
    		System.out.println(queue);
    		queue.removeFirst();
    		queue.removeFirst();
    		System.out.println("After removing First two "+queue);
  	}
}