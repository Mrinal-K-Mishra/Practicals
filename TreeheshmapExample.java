package CollectionEg;

import java.util.Map;
import java.util.TreeMap;

public class TreeheshmapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		//adding elements
		tm.put(200, "Riya");
		tm.put(205,"priya");
		tm.put(205,"rima");
		tm.put(201,"rohit");
		//desending order
		System.out.println("Descending map:"+tm.descendingMap());
		//headmap return keys pairs whose keys are less than/equal to the specified keys
		System.out.println("Heap map:"+tm.headMap(201,true));
		//headmap return keys pairs whose keys are greater than/equal to thespecified keys
		System.out.println("Tail map:"+tm.tailMap(201,true));
		//headmap return keys pairs exist between specified keys
		System.out.println("sub map:"+tm.subMap(201,true,205,true));
		//traversing map
		for(Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			tm.remove(205);
			System.out.println("After removing:");
			for(Map.Entry m1 : tm.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
		
	}

}
