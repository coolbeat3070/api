package api.util.hashMap;
/*
 자바의 정석 예제11-31 
 * */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GradeDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("김연아", new Integer(98));
		map.put("아사다 마오", new Integer(55));
		map.put("러시아사람", new Integer(30));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("참가자 :"+e.getKey()
					+" ,점수 :" + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 :" + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()){
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + total/set.size());
		System.out.println("1등 : " + Collections.max(values));
		System.out.println("꼴등 :" + Collections.min(values));
	}
}
