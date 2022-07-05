//Creating a class
public class Copycons {
    private String name;
    private double marks;
    //Creating a Constructor
    Copycons(String name , double marks) {
    	this.name=name;
    	this.marks=marks;
    }
    //creating a copy constructor
    Copycons(Copycons c)
    {
    	this.name=c.getName();
    	this.marks=c.getMarks();
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public double getMarks() {
    	return marks;
    }
    public void setMarks(double marks) {
    	this.marks=marks;
    }
    //creating another class
public class Copycons1{
	public static void main (String[] args) {
		Copycons c1 = new Copycons("Jaita",56.25); //creating an object
		Copycons cloneofc1=new Copycons(c1);       //creating an object
		c1.setName("Rupa");
		System.out.println("student "+c1.getName());
		System.out.println("student "+cloneofc1.getName());
	}
}
    
    
}