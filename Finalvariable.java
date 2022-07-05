//Creating a class
public class Finalvariable {
	 class Finalclass extends Finalvariable{
		 void run() {
			 System.out.println("Working safely");
		 }
		 public static void main(String args[]) {
			 Finalclass b = new Finalclass ();  //creating an object
			 b.run();  //called object
		 }
	 }
}