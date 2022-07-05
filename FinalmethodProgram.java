//creating a class
public class FinalmethodProgram {
	final void run() {   //create a final method 
		System.out.println("Working"); {
			class Finalmethod extends FinalmethodProgram{
				void run () {
					System.out.println("Working safely");
				}
				public static void main(String[] args) {
					 Finalmethod b = new  Finalmethod();  //creating an object
					b.run();  //to called method
				}
			}
		}
	}

}
