package api.lang.string;
/*
subString()
시작위치(begin) 부터 끝위치(end) 범위 문자열 리텅
begin <= x < end
 * */
public class SubstringDemo {
	public static void main(String[] args) {
		System.out.println("파라미터 한개일때 : "+"Hello Tom".substring(5));
		System.out.println("파라미터 두개일때 : "+"Hello Tom".substring(5,7));
	}
}
