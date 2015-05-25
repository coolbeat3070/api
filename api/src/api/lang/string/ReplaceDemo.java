package api.lang.string;
/*
replace(str1, str2) 문자열중 str1 과 일치하는 것을
	str2로 변경
 * */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		
		System.out.println("A B C D : A B C D".replaceAll(" C D", " E F"));
	}
}
