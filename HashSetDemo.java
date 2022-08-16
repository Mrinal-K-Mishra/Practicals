package CollectionEg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String ...args) {
		HashSet<String>set=new HashSet();
		set.add("ram");
		set.add("rima");
		set.add("shyam");
		set.add("rahim");
		set.add("ramesh");
		System.out.println("original list:"+set);
		
		set.remove("ram");
		System.out.println("After invoking remove:"+set);
		HashSet<String>set1= new HashSet();
		set1.add("pallabi");
		set1.add("Rahul");
		System.out.println("update list:"+set);
		
		set.removeAll(set1);
		set.clear();
		System.out.println("present list:"+set);
	}
 }
