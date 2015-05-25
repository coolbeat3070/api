package api.util.vector;

import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();  
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("학번을 입력해주세요.");
		  String hak = scanner.next();
		  System.out.print("이름을 입력해주세요.");
		  String name = scanner.next();
		  System.out.print("국어점수를 입력해주세요.");
		  int kor = scanner.nextInt();
		  System.out.print("영어점수를 입력해주세요.");
		  int eng = scanner.nextInt();
		  System.out.print("수학점수를 입력해주세요.");
		  int mat = scanner.nextInt();
		  service.input(new GradeVO(hak, name, kor, eng, mat));
		  
		  System.out.println("성적을 검색하려는 이름을 입력해주세요.");
		  String searchName = scanner.next();
		  service.searchGradeByName(searchName);
	//	  service.ascSortHak();
	//	  service.descSortTot();
		 
		 
	}
}
