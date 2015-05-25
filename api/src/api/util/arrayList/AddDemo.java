package api.util.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddDemo {
	public static void main(String[] args) {
		
		// Vector는 내부적을 String 사용. 속도 느림. 동기화 지원
				// ArrayList는 내부적으로 StringBuffer 사용. 동기화 지원 안함
				ArrayList<String> lists = new ArrayList<String>();

				// 항목 추가
				lists.add("서울");
				lists.add("부산");
				lists.add("대구");

				/* 출력1 . iterator() 이용 */ 
				Iterator<String> it1 = lists.iterator();
				while (it1.hasNext()) {
					System.out.printf("%s", it1.next());
				}
				System.out.println();
				
				/* 출력2. listIterator() 이용 */ 
				ListIterator<String> it2 = lists.listIterator();
				while (it2.hasNext()) {
					System.out.printf("%s", it2.next());
					// 다운 캐스팅 필요없다.String이 될 예정
				}
				System.out.println();

				/* 출력3. previous() 이용 */ 
				while (it2.hasPrevious()) {
					System.out.printf("%s", it2.previous()); // ListIterator에서만 가능
				}
				System.out.println();

				// 전체 요소를 한 번에 입력
				List<String> lists2 = new ArrayList<String>();
				lists2.addAll(lists); // 서울, 부산, 대구 입력

				/* 출력4. 확장 for문 */ 
				for (String s : lists2)
					System.out.printf("%s", s);
				System.out.println();

				// 검색 명령을 위한 데이터 추가
				lists2.add("광주");
				lists2.add("인천");
				lists2.add("대전");

				/* 출력5. 검색해서 출력*/ 
				Iterator<String> it3 = lists2.iterator();
				String str;
				while (it3.hasNext()) {
					str = it3.next();
					if (str.startsWith("대")) // => "대"로 시작하는 문자열 검색
						System.out.printf("%s ", str);
				}
				System.out.println();

				// 동일한 자료 입력 가능
				lists2.add("대전");
				lists2.add("대전");
				lists2.add("서울");

				Iterator<String> it4 = lists2.iterator();
				while (it4.hasNext()) {
					System.out.printf("%s ", it4.next());
				}
				System.out.println();
	}
}
