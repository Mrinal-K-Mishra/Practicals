//whether the studet is pass or not
package Exception;

public class ThrowExample {
public static void myDisplay(int a)	throws ArithmeticException {
 if (a>=0 && a<=35) {
	 throw new ArithmeticException("Value cannot be less than 35");
	 }
 else {
	 System.out.println("You are Pass");
 }
  }
public static void main(String[] args) {
	myDisplay(30);  //predefined value
}

}
