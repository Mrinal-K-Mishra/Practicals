package String;
import java.util.Scanner;
public class StringEquality {
	public static void main(String args[]) {
		String str1,str2;
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		str1 = ab.nextLine();
		System.out.println("Enter 2nd String: ");
		str2 = ab.nextLine();
		
		if(str1.equals(str2)) 
			System.out.print("Equal string");
		else 
			System.out.println("Not equal String");
		
	}

}
