//Creating a class
public class Staticvariable{
     int rollno;
     String name;
     static String college="Regent";
     Staticvariable(int r,String n) {    //Creating a Parameterised costructor
    	 rollno=r;
    	 name=n;
     }
    //Creating a method 
     void display() {
    	 System.out.println(rollno+" "+name+" "+college);
     }
     public class Staticvariable1{
    	 public static void main(String[] args) { 
    		//Creating an objects 
    		 Staticvariable s1 = new Staticvariable(10,"Jaita");
    		 Staticvariable s2 = new Staticvariable(11,"Rupa");
    		//To called method  
    		 s1.display();
    		 s2.display();
    		 }
    	 }
}