package Wrapper;
import java.util.ArrayList;

public class Unboxingeg {
		public static void main(String arg[]) {
			ArrayList<Integer>a1=new ArrayList<Integer>();
			// autoboxing
			a1.add(5);
			a1.add(2);
			System.out.println("ArrayList:"+a1);
			//Unboxing
			int a= a1.get(0);
			System.out.println("Value of index 0:"+a);
		}
	}
	

