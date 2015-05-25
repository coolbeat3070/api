package api.lang.string;
/*
toUpperCase() : 대문자로 바꾸기
trim() : 공백을 모두 제거하기
valueOf() : 다른 타입을 모두 문자열로 리턴함
 * */
public class ValueOfDemo {
	public static void main(String[] args) {
		String str = " Hello Java  " ;
		String msg = null;
		System.out.println("테스트용 문장 : " + str);
		msg = str.replace("Hello", "GoodBye");
		System.out.println("MSG 에서 Hello 를 GoodBye로 바꾸면 ? " + msg);
		msg = str.toUpperCase();
		System.out.println("MSG 에서 대문자로 바꾸면 ? " + msg);
		msg = str.toLowerCase();
		System.out.println("MSG 에서 소문자로 바꾸면 ? " + msg);
		msg = str.trim();
		System.out.println("MSG 에서 앞뒤 공백을 모두 제거하면 ? " + msg);
		msg = String.valueOf(str.length());
		System.out.println("MSG 의 공백까지 포함된 칸수는 ? " + msg + "칸");
	}
	
	
	
}
