package Wrapper;
public class Unboxing {
		public static void main(String arg[]) {
			Integer a=new Integer(10);// converting Integer into int
			Integer i=a.intValue();// now compiler will write int.value() unboxing
			Integer j=a;
			System.out.println(a+" "+i+" "+j);
		}
	}
