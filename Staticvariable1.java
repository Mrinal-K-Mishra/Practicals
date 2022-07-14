//Creating a class
public class Staticvariable1 {
	int rollno;
	String name;
    static String college="Regent";
    static void change() {
    	college="ITC";
    }
    //Creating a Parameterised constructor
    Staticvariable1 (int r ,String n) {
    	rollno=r;
    	name=n;
    }
    //creating a method
    void display() {
   	 System.out.println(rollno+" "+name+" "+college);
    }
    //Creating another class
    public class Staticvariable{
   	 public static void main(String[] args) {
   		 Staticvariable1.change();
   	      //creating an objects
   		Staticvariable1 s1 = new Staticvariable1(12,"Mrinal");
   		 Staticvariable1 s2 = new Staticvariable1(13,"Sayan");
   		 //to called method
   		 s1.display();
   		 s2.display();
   		 }

}
}
