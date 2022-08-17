package CollectionEg;
//generic
import java.util.HashMap;
import java.util.Map;

public class HashmapegDemo1 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> mp = new HashMap<Integer,String>();
		//adding elements
		mp.put(101,"pallabi");
		mp.put(102,"rahul");
		mp.put(200,"sweta");
		mp.put(100,"karan");
		//traversing elements in any order
		for(Map.Entry en:mp.entrySet()) {
			System.out.println(en.getKey() +" " + en.getValue());
		}
	}

}
