package api.lang.string;

import java.lang.String;
import java.lang.System;

/*
 * java.lang.String
 * charAt() : 지정된 위치에 있는 문자를 리턴함. index 는 0부터 시작
 * indexOf() : 주어진 문자가 존재하는지 확인하여 위치를 알려줌. 없으면 -1 반환
 * 
 * */
public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "850719-2566789";
		char isMan = ssn.charAt(ssn.indexOf("-")+1); 
		switch (isMan) {
			case '1' : case'3' : System.out.println("남성");break;
			case '2' : case'4': System.out.println("여성");break;
			default : System.out.println("잘못된 값");break;
		}
		String birthday = ssn.substring(0,ssn.indexOf(ssn.charAt(ssn.indexOf("-"))));
		System.out.println(ssn.charAt(ssn.indexOf("-")+1));
		System.out.println("생년월일 : "+birthday);
	}
}
