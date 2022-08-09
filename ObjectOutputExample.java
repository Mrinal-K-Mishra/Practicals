package IOException;

	import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;

	public class ObjectOutputExample {
		public static void main(String args[]) {
			try {
				ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("C:\\Users\\a\\OneDrive\\text"));
				obj.writeObject(new Student(1982, "Mrinal", 8500));
				obj.close();
				System.out.println("Done");
			}catch(Exception e) {
				System.out.println(e);
			}
		}

	}

