import java.util.*;

public class TreeMapExample
{
	public static void main(String[] args) 
	{
		System.out.println("Tree Map Example");
		TreeMap <String, Integer> tMap = new TreeMap<String, Integer>();

		//tMap.put(key, value)

		tMap.put("Sunday", 1);
		tMap.put("Monday",2);
		tMap.put("Tuesday",3);
		tMap.put("Wednesday",4);
		tMap.put("Thursday",5);
		tMap.put("Friday",6);
		tMap.put("Saturday",7);
		System.out.println(tMap);
		System.out.println("Keys of tree map: " + tMap.keySet());
		System.out.println("Values of tree map: " + tMap.values());
		System.out.println("Key: 5 value: " + tMap.get("5")); 
		
// 5 is passed as string because all the keys in the form of String and it will return "null" because 
//there is no any String which returns a value for key "5". all the keys are as:sunday monday.........

		System.out.println("First key: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) );
		System.out.println("Last key: " + tMap.lastKey() + " Value: " + tMap.get(tMap.lastKey()) );
		System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
		System.out.println("Now the tree map Keys: " + tMap.keySet());
		System.out.println("Now the tree map contain: " + tMap.values() );
		System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
		System.out.println("Now the tree map Keys: " + tMap.keySet());
		System.out.println("Now the tree map contain: " + tMap.values());
	}
}