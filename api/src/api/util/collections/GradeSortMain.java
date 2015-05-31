package api.util.collections;

import java.util.Collections;
import java.util.Vector;

public class GradeSortMain {
	public static void main(String[] args) {
		Vector<GradeVO> grades = new Vector<GradeVO>();
		
		System.out.println("이름 오름 정렬");
		Collections.sort(grades, new NameAscCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("이름 내림 정렬");
		Collections.sort(grades, new NameDescCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("총점 오름 정렬");
		Collections.sort(grades, new TotalAscCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("총점 내림 정렬");
		Collections.sort(grades, new TotalDescCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
	}
}
