package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		//	ArrayList list = new ArrayList(); 도 맞긴 한데..
		//  인터페이스 타입으로 .. 선언을 추천함
			List list = new ArrayList();
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
			ListIterator it = list.listIterator();
			/* 순방향 출력*/
			System.out.println("순방향 출력");
			while(it.hasNext()){
			//	Object obj = it.next(); 줄임말
				System.out.print(it.next() + "\t");
			}
			System.out.println();
			System.out.println("역방향 출력");
			/*역방향 출력*/
			
			while(it.hasPrevious()){
				System.out.print(it.previous() + "\t");
			}
			
		}
}
