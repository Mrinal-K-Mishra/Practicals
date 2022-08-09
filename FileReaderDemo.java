package IOException;
import java.io.FileReader;
public class FileReaderDemo {

		public static void main(String[] args) {
			try {
				FileReader obj1 = new FileReader("C:\\Users\\a\\OneDrive\\text");
				
				int i;
				while((i = obj1.read()) != -1) {
					System.out.print((char)i);
				}
				obj1.close();
				System.out.println("Done");
				}catch(Exception e) {
					System.out.println(e);
				}
		}

	}


