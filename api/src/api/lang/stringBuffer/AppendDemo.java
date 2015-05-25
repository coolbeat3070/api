package api.lang.stringBuffer;
/*
append()
파라미터값을 String 으로 변환하여 
원 문자열 뒤에 붙인다. 
 * */
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;

public class AppendDemo {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		// System.out.println("buf 에 주어진 기본 용량 capacity() : "+buf.capacity());
		// System.out.println("length() : "+buf.length());
		StringBuffer buf1 = new StringBuffer("A B C");
		StringBuffer buf2 = buf1.append(" D E F");
		String msg = "";
		
		if(buf1 == buf2){
			msg = "buf1==buf2";
		}else{
			msg = "buf1!=buf2";
		}
		System.out.println(msg);
		System.out.println(buf1.toString());		
		System.out.println(buf2.toString());
		/*
		 buf2 는 새롭게 생성되어 전달된 객체가 아니며,
		 buf1 이 내부적으로 수정되어 전달 받음으로
		 동일한 주소값을 참조한다.
		 
		 StringBuffer 클래스는 String 클래스와 다르게 무분별하게
		 객체 생성을 하지 않는다.
		 그리고, 직접 수정할 수 있는 가변성의 특징이 있다.
		 그러므로 빈번한 문자열 수정 작업이 필요한 경우 
		 String 클래스 보다 StringBuffer 클래스가 더 유익하다.
		 [출판사]한빛아카데미 자바5.0 p.195
		 * */
	}
	
}
