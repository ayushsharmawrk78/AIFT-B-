package lec40;

import java.util.Enumeration;
import java.util.HashMap;

public class Hashmapintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer>map = new HashMap<>();
System.out.println(map);

//map.put("ankush", 121);
//System.out.println(map.getOrDefault("ankush", 1));
map.put("raghav", 12);
map.put("raman",12);
System.out.println(map.containsKey("raman"));
System.out.println(map);

System.out.println(map.get("raman"));
map.put("riya", 18);;
System.out.println(map);

map.put("riya", 19);System.out.println(map);


Iterable<T>
//map.put(null, null);
System.out.println(map);

map.remove("raman");
Enumeration<E>
for(String key:map.keySet()) {
	System.out.println(key);
	System.out.println(map.get(key));
}
System.out.println(map.entrySet());





	}

}
