package CollectionEg;

import java.util.HashSet;
import java.util.Iterator;

public class HasshsetDemo {
	public static void main(String ...args) {
		
		HashSet<String>set=new HashSet();
		set.add("ram");
		set.add("rima");
		set.add("sayam");
		set.add("rahim");
		set.add("ramesh");
		Iterator<String>i =set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
