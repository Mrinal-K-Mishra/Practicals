package CollectionEg;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String ...args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Jaita");
		ll.add("Rupa");
		System.out.println("after adding:");
		
		ll.add(1,"Riya");
		Iterator <String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
