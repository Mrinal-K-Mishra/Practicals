package IOException;

	import java.io.FileInputStream;
	import java.io.ObjectInputStream;

	public class ObjectInputExample {
		public static void main(String args[]) {
			try {
				ObjectInputStream obj = new ObjectInputStream(new FileInputStream("C:\\Users\\a\\OneDrive\\text"));
				Student s = (Student) obj.readObject();
				System.out.println("id is: " + s.id + " name is: " + s.name + " fees is: " + s.fees);
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}

	}


