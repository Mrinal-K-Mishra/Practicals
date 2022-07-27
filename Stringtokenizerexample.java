package String;
import java.util.StringTokenizer;
public class Stringtokenizerexample { //class
 public static void my() { //my method
	 StringTokenizer t = new StringTokenizer("Anudip Foundation skill and Carrer Development Center"," ");
	 while(t.hasMoreTokens()) { //boolean method it checks if there is more tokens available or not
		 System.out.println(t.nextToken(" ")); { //string method it returns the next token from string tokenizer
			 StringTokenizer st = new StringTokenizer("I am riya,Staying in Kolkata");
			 while(st.hasMoreTokens()) {
				 System.out.println(st.nextToken(","));
				 
			 }
		 }
	 }
 }
public static void main(String[] args) {
	my();
	//TODO Auto-generated method stub
}
}
