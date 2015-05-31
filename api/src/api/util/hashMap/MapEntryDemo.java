package api.util.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapEntryDemo {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		Set<String> set = new HashSet<String>();
		Properties props = new Properties();
		map.put("삼성", "갤럭시");
		map.put("삼성", "노트");
		set.add("G4");
		set.add("G패드");
		props.put("애플", "아이폰");
		props.put("애플", "아이패드");
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println("Map 에 담긴 값 : " + entry.getKey() + "-"
					+ entry.getValue());
		}
		for (String str : set) {
			System.out.println("Set 에 담긴 값 : " + str);
		}

		for (Map.Entry<Object, Object> entry : props.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "-"
					+ entry.getValue());
		}
		Set<String> keyset = map.keySet();// key값을Set으로
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			System.out.println(key + " " + map.get(key));// value
		}
	}
}
