//Creating a class
public class Problemthiskeyword {
	int rollno;
    String name;
    float fee;
    //Creating a Constructor
    Problemthiskeyword(int rollno,String name, float fee){
    	//using this keyword
   	 this.rollno=rollno;
   	 this.name=name;
   	 this.fee=fee;
    }
    void display() {    //creating a method
   	 System.out.println(rollno+" "+name+" "+fee  );
    }
    //creating another class
    public class Problemthiskeyword1{
   	 public static void main(String[] args) {
   		 //creating an object
   		Problemthiskeyword s1 = new Problemthiskeyword(10,"Jaita",5000);
   		Problemthiskeyword s2 = new Problemthiskeyword(11,"Rupa",4000);
   		//to called method
   		 s1.display();
   		 s2.display();
   		 }
   	 }
}
