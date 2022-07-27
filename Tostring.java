package String;

public class Tostring {
	int rollno; //integer type var
	String name,addr; //string
	Tostring(int rollno,String name,String addr) {
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}
	public String toString() {  //return obj to string
		return super.toString(); //obj to string
	}
	public static  void main(String[] args) {
		Tostring s1 = new Tostring(1,"Jaita","Kolkata"); //return the value
		Tostring s2 = new Tostring(2,"Arpan","Delhi");
		System.out.println(s1);
		System.out.println(s2);
	}
	

}
