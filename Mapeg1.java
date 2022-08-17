package CollectionEg;
//non generic
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//non generic
public class Mapeg1 {
	public static void main(String[] args) {
		Map mp = new HashMap();
		//adding element
		mp.put(1,"pallabi");
		mp.put(8,"rahul");
		mp.put(2,"sweta");
		mp.put(7,"karan");
		//traversing elements
		Set set = mp.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			//converting to map
			Map.Entry en=(Map.Entry)i.next();
			System.out.println(en.getKey() + " " + en.getValue());
		}
	}

}
