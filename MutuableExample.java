package String;
//append insert replace delete reverse-mutable
public class MutuableExample {
	public static void my() {
		StringBuffer s = new StringBuffer("Hello");
		s.append("World");
		System.out.println("String is : " + s);
		s.insert(2, "Riya");//(int off set,string s)//heriyalloworld
		System.out.println("insert is : " + s);
		s.replace(1, 3, "java");//(beginwith,endswith,string s)
		System.out.println("replace is : " + s);//heriyalloworld
		StringBuilder s1=new StringBuilder("world");
		s1.replace(1, 3, "java");
		System.out.println("replace is : " + s1);
		s1.delete(1, 3);
		System.out.println("delete is : " + s);
		s1.reverse();
		System.out.println("reverse is : " + s);
	}
	public static void main(String[] args) {
		my();
	}

}
