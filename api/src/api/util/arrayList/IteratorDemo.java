package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
	//	ArrayList list = new ArrayList(); 도 맞긴 한데..
	//  인터페이스 타입으로 .. 선언을 추천함
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		while(it.hasNext()){
		//	Object obj = it.next(); 줄임말
			System.out.print(it.next() + "\t");
		}
		
	}
}
