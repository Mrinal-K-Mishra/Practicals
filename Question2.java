package CollectionEg;
import java.util.ArrayList;
public class Question2 {
		public static void main(String args[]) {
				ArrayList<String> al = new ArrayList<>();
				// adding elements in array list
				al.add("red");
				al.add("Green");
				al.add("Orange");
				al.add("White");
				al.add("Black");
				// printing array list before adding element at index 0
				System.out.println(al);
				// printing array list after adding element at index 0
				al.add(0, "Pink");
				System.out.println(al);
		}

	}


