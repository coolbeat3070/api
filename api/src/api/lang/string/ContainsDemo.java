package api.lang.string;
/*
containts(s) : s 문자가 포함되었는지 체크 
 * */
public class ContainsDemo {
	public static void main(String[] args) {
		String str = "abcde";
		System.out.println(str.contains("f") ? "true" : "false" );
	}
}
