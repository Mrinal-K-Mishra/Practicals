//Creating a class
public class DefaultCons {
	private String name;
	DefaultCons()  //creating a DefaultCons
	{
		name = "Jaita";
		System.out.println("Cons Called");
	}
	public static void main(String args[]) {
	DefaultCons obj=new DefaultCons();  //Creating an object
	System.out.println("The name is "+obj.name);
		
	}

}