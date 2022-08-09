package IOException;

	import java.io.FileReader;
	import java.io.FileWriter;

	public class FileWriterDemo {
		public static void main(String[] args) {
			try {
				FileWriter obj = new FileWriter("G:\\File_IO\\New.txt");
				obj.write("Welcome to Anudip Foundation");
				FileReader obj1 = new FileReader("G:\\File_IO\\New.txt");
				
				int i;
				while((i = obj1.read()) != -1) {
					System.out.println((char)i);
				}
				obj.close();
				obj1.close();
				System.out.println("Done");
				}catch(Exception e) {
					System.out.println(e);
				}
		}

	}


