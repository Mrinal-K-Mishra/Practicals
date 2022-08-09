package IOException;
import java.io.Serializable;
	public class Student implements Serializable {
		int id;
		String name;
		int fees;
		
	public Student(int id, String name, int fees) {
			super();
			this.id = id;
			this.name = name;
			this.fees = fees;
		}

	}


