package String;

public class StringExample {
	public void show() {
		char [] arr = {'j','a','v','a'};
		String s=new String(arr);
		System.out.println("The value is " + s);
		System.out.println(arr);
	}
	public void myfunction() {
		String n ="Jaita";
		String n1 ="Jaita";
		String n2=new String("Jaita");
	}
	public static void main(String[] args) {
		StringExample obj=new StringExample();
		obj.show();
		obj.myfunction();
	}

}
