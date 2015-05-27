package api.lang.string;
/*
 * java.lang.String
 * 문자열 앞뒤 공백 제거.
 * 문장 내부의 공백은 그대로 유지.
 * */
public class TrimDemo {
	public static void main(String[] args) {
		String str = "    Welcome Java World !!  ";
		System.out.println(str.trim());
		// 문장내부의 공백까지 제거하려면 아래처럼 사용
		System.out.println(str.replace(" ", ""));
		// 느낌표 하나만 제거
		System.out.println(str.replace("!", "").trim());
		System.out.println(str.replaceAll(".!", "").trim());
		
	}
}
