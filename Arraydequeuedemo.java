package CollectionEg;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydequeuedemo {
	public static void main(String ...args) {
		//creating & adding
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("pallabi");
		deque.add("subhrajit");
		deque.add("mamta");
		deque.add("monalisa");
		deque.add("anju");
		System.out.println("After offer first");
		//traversing
		for(String str:deque) {
			System.out.println(str);
		}
		//deque.poll() & deque.pollFirst same as poll()
		deque.pollLast();
		System.out.println("After poll Last");
		for(String str:deque) {
			System.out.println(str);
		}
	}

}
