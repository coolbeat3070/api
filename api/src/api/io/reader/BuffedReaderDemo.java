package api.io.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffedReaderDemo {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// System.in 은 키보드를 뜻함.
		// new InputStreamReader(...) 은 입력받은 문자를 문자인코딩함
		// new BufferedReader(...) 은 입력받은 문자를 버퍼에 저장함
		System.out.println(" 문장을 입력하세요.");
		String str = "";
		try{
			str = in.readLine();
		}catch(Exception ex){ex.printStackTrace();}
		System.out.println("입력받은 내용 : "+str);
	}
}
