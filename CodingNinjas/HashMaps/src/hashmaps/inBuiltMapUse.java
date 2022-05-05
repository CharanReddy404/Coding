package hashmaps;
import java.util.HashMap;
import java.util.Set;

public class inBuiltMapUse {
	
	public static void main(String[] args) {
		
//		HashMap<String,Integer> map = new HashMap<>();
//		map.put("abc", 1);
//		map.put("def", 3);
//		if(map.containsKey("abc")) {
//			System.out.println("it has abc");
//		}
////		if(!(map.containsKey("bbc"))) {
////			System.out.println("it does not have bbc");
////		}
//		int v = map.get("abc");
//		System.out.println("abc = "+ v);
//		System.out.println("Size: "+map.size());
////		map.remove("def");
//		if(!(map.containsKey("abc"))) {
//			System.out.println("it does not have abc");
//		}
//		map.put("abc", 4);
//		map.put("aaa", 12);
//		int v1 = map.get("abc");
//		System.out.println("abc = "+v1);
//		System.out.println("size: "+map.size());
//		Set<String> keys = map.keySet();
//		for(String s : keys) {
//			System.out.println(s);
//		}
//		System.out.println();
//		System.out.println(map.containsValue(12));
		
		Map<String, Integer> m = new Map<>();
		System.out.println(m.size());
		m.insert("abc", 24);
		System.out.println(m.size());
		System.out.println(m.getvalue("abc"));
		
	}
}
