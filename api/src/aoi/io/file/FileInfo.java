package aoi.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfo {
	public static void main(String[] args) {
		System.out.println("파일 이름을 넣으세요");
		String name = "";
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine(); // 한 라인을 읽어 들임
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Error : " + ex.toString());
		}
		// file 클래스 객체 생성
		File file = new File(name);
		if(file.exists()){
			System.out.println("파일 이름 :" + file.getName());
			System.out.println("상대 경로 :" + file.getPath());
			System.out.println("절대 경로 :" + file.getAbsolutePath());
			System.out.println("쓰기 가능 :" + file.canWrite());
			System.out.println("읽기 가능 :" + file.canRead());
			System.out.println("파일 길이 :" + file.length() +"바이트");
		}else{
			System.out.println("해당 파일은 존재하지 않음.");
		}
		
	}
}
/*
 * 절대경로를 입력해야 출력됨.
 * */
