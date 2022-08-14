package CollectionEg;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSorting {
		public static void main(String args[]) {
			ArrayList<String> al = new ArrayList<>();
			// adding String object to array list
			al.add("Subrajit");
			al.add("Mamta");
			al.add("Monalisa");
			al.add("Anju");
			al.add("Samik");
			al.add("Pallabi");
			al.add("Khusbu");
			al.add("Bhaskar");
			al.add("Suruti");
			System.out.println("String sorted list: ");
			// sorting array list
			Collections.sort(al);
			for(String s : al) {
				System.out.println(s);
			}
			System.out.println();
			ArrayList<Integer> al2 = new ArrayList<>();
			// adding Integer object to array list
			al2.add(76);
			al2.add(89);
			al2.add(94);
			al2.add(43);
			al2.add(32);
			al2.add(17);
			al2.add(25);
			al2.add(51);
			al2.add(-12);
			System.out.println("Integer sorted list: ");
			// sorting array list
			Collections.sort(al2);
			for(Integer i : al2) {
				System.out.println(i);
			}
			
		}

	}


