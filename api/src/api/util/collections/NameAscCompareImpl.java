package api.util.collections;

import java.util.Comparator;

public class NameAscCompareImpl implements Comparator<GradeVO>{
	/*
	 * 이름으로 오름차순 정렬
	 * */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return first.getName().compareTo(second.getName());
	}

}
