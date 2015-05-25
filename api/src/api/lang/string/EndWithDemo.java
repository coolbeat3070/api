package api.lang.string;
/*
endWith(s) : s 로 끝나는지 여부 체크
 * */
public class EndWithDemo {
	public static void main(String[] args) {
		System.out.println(
				"Hello.txt".endsWith("txt") ? "txt 파일입니다" : "txt 파일이 아닙니다.");
	}
}
