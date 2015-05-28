package api.util.vector;

import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();  
		Scanner scanner = new Scanner(System.in);
		int count=0 ;
		int flag = 0;
		System.out.println("성적표 입력 프로그램입니다.");
		
		while(true){
			System.out.println("진행하시려면 1을"
					+ "종료하시려면 -1 을 입력하세요 ");
			flag = scanner.nextInt();
			if(flag != -1){
				count++;
				System.out.println(count+"번째 입력입니다.");
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
			}else{
				System.out.println("현재 등록된 학생수는"+count+"입니다.");
				break;
			}
			
			
		}
		  
		  
		System.out.println("성적을 검색하려는 이름을 입력해주세요.");
		  String searchName = scanner.next();
		  service.searchGradeByName(searchName);
		  service.ascSortHak();
		  service.descSortTot();
		 
		 
	}
}
