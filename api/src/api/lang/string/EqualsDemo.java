package api.lang.string;
/*
문자열 관련 Class
- == 은 객체의 Reference Value(Hash Code Table)을 비교
- 문자열 비교시는 반드시 equals() 메소드를 이용
- new 를 이용하면 heap 영역에 새로운 메모리를 할당하고 hashCode 를 생성
 * */

public class EqualsDemo {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		String result1 = str1 == str2 ? "str1 과 str2 는 동일" : "str1 과 str2 는 다름";
		String result2 = str1.equals(str2) ? "str1 과 str2 는 동일" : "str1 과 str2 는 다름";
		
		System.out.println("str1 == str2 경우 :" + result1);
		System.out.println("str1.equals(str2) 경우 :" + result2);
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		String result3 = str3 == str4 ? "str3 과 str4 는 동일" : "str3 과 str4 는 다름";
		String result4 = str3.equals(str4) ? "str3 과 str4 는 동일" : "str3 과 str4 는 다름";
		
		System.out.println("str3 == str4 경우 :" + result3);
		System.out.println("str3.equals(str4) 경우 :" + result4);
		
		/*
		 result3 의 결과가 다름으로 나온 이유
		 - String 클래스의 생성자를 이용하여 String 인스턴스 생성한 경우에는
		 - new 연산자에 의해 메모리 할당이 이뤄지기 때문에
		 - 항상 새로운 String 인스턴스가 생성된다.
		* */
		/*
		모든 클래스파일(*.class) 에는 constant pool 이라는 상수풀이 있어서,
		클래스 내에 사용되는 모든 리터럴과 상수들이 저장되어있다.
		등록하고자 하는 문자열이 상수풀이 이미 존재하는 경우에는
		그 문자열의 주소값을 반환한다.
		 * */
	}
}
