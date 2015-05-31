package api.util.hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scanner.next();
		System.out.println("나이를 입력해주세요");
		int age = scanner.nextInt();
		System.out.println("주소를 입력해주세요");
		String addr = scanner.next();
		System.out.println("ID를 입력해주세요");
		String id = scanner.next();
		System.out.println("비번을 입력해주세요");
		String password = scanner.next();
		MemberService service = new MemberServiceImpl();
		service.join(name, age, addr, id, password);
		System.out.println("회원가입이 되었습니다.");
		System.out.println("로그인을 해주세요.");
		System.out.println("ID를 입력해주세요");
		id = scanner.next();
		System.out.println("비번을 입력해주세요");
		password = scanner.next();
		service.login(id, password);
	
	}
}
