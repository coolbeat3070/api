package api.lang.wrapper;
/*
JDK1.5 부터 도입된 오토박싱(autoboxing) 기능으로
반환값이 기본형일 때와 wrapper class 일 때
차이가 없다. 그래서 parseInt() 와 valueOf() 차이가 없다
 * */
public class ParseIntDemo {
	public static void main(String[] args) {
		// 리터럴값을 기본형으로 캐스팅시 변환 방법
		int num1 = Integer.parseInt("200");
		int num2 = Integer.valueOf("200");
		int result = num1 + num2;
		System.out.println(result);
		
		// 기본형을 참조형으로 형변환(형변환 생략가능)
		Integer num3 = (Integer)result;
		System.out.println("기본형을 참조형으로 형변환한 결과 :" + num3);
		
		int num4 = 2 + num3;
		System.out.println("참조형과 기본형간의 연산결과 :" + num4);
	}
}
