import java.util.*;
class TestMap3
{
	public static void main(String args[])
	{
		Map m1=new HashMap();
		m1.put("sunday",1);
		m1.put("monday",2);
		m1.put("tuesday",3);
		m1.put("wednesday",4);
		m1.put("thursday",5);
		m1.put("friday",6);
		m1.put("saturday",7);
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
	}
}