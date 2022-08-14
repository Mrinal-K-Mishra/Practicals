package CollectionEg;
import java.util.ArrayList;
import java.util.Iterator;
public class Question1 {

		public static void main(String args[]) {
			ArrayList<String> al = new ArrayList<>();
			// adding elements in array list
			al.add("red");
			al.add("Green");
			al.add("Orange");
			al.add("White");
			
			// traversing through the array list element
			Iterator<String> itr1 = al.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
		}


}
