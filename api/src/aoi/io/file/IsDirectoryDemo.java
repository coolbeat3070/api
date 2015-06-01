package aoi.io.file;
/*
 * java.io.File 의 메소드인
 * isFile() // 해당 파일이 있는 지 확인..없으면 false
 * isDirectory() // 해당 패스에 디렉토리(폴더)가 존재하는지 .없으면 false
 * */
import java.io.File;
/*
 * 디렉토리 vs 폴더 : 둘은 같은 의미이다. 그러나 약간의 의미적 차이점이 있다.
 * 폴더 : GUI 모드에서 파일을 넣어 두는 곳
 * 디렉토리 : 텍스트 모드로 cmd 창에서 경로 구분시 주로 사용.
 * */
public class IsDirectoryDemo {
	public static void main(String[] args) {
		// import 단축키
	//	String directory = "c:/temp.txt"; // 지정한 c:/temp.txt 는 디렉토리가 아님
		String directory = "c:/temp";
		File file = new File(directory);
		// 디렉토리인지 검사
		if(file.isDirectory()){
			System.out.println("검색 디렉토리 :" + directory);
			System.out.println("디렉토리 내부 파일/디렉토리 목록");
			
			String str[] = file.list(); // 디렉토리 내부의 파일,디렉토리 목록
			for(int i=0;i<str.length;i++){
				File file2 = new File(directory + "/" + str[i]);
				if(file2.isDirectory()){
					System.out.println(str[i]+" : 디렉토리");
				}else{
					System.out.println(str[i]+" : 파일");
				}
			}
		}else{
			System.out.println("지정한 "+directory+" 는 디렉토리가 아님");
		}
	}
}
