package api.util.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		for(int i=0;set.size()<6;i++){
			int num = (int) (Math.random()*45) + 1;
			set.add(num);  // 중복된 값을 저장하지 않는다.
		}
		/*
		 * Collections.sort(List list) 를 사용하기 위해
		 * Set 을 List 에 담는다.
		 * Collection 은 인터페이스이고,
		 * Collections 는 스태틱 클래스이다.
		 * */
		List list = new LinkedList(set); 
		Collections.sort(list); // 오름차순 으로 바꾼다
		System.out.println(list);
	}
}
