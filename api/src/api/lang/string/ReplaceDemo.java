package api.lang.string;
/*
replace(str1, str2) 문자열중 str1 과 일치하는 것을
	str2로 변경
 * */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		
		System.out.println("A B C D : A B C D".replace(" C D", " E F"));
		System.out.println("A B C D : A B C D".replaceAll(" C D", " E F"));
		
		System.out.println("replace 와 replaceAll 차이점");	
		
		System.out.println("[1] A B C D : A B C D ".replace(" C D ", " E F ").replace(":", ""));
		System.out.println("[2] A B C D : A B C D ".replaceAll(" C D ", " E F ").replaceAll(":", ""));
		
		System.out.println("replace 와 replaceAll 차이점");	
		
		System.out.println("[1] A B C D :: A B C D ".replace(" C D ", " E F ").replace(".:", ""));
		System.out.println("[2] A B C D :: A B C D ".replaceAll(" C D ", " E F ").replaceAll(".:", ""));
		
		/*
		 * replace 와 replaceAll 차이점
		 * - replace() 일반문자만 변경
		 * 자바 1.5 부터는 동일해짐.
		 * - replaceAll() 일반문자 + 정규식 포함 변경
		 * 
		 
		String str = "Hello Jav a";
		System.out.println("[1]"+str.replace(" ", ""));
		System.out.println("[2]"+str.replaceAll(" ", ""));
		//p{Space} 은 반드시 대문자로
		System.out.println("[3]"+str.replaceAll("\\p{Space}", ""));
	
		* */
		
	}
}
