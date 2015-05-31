package api.util.collections;

import java.util.Comparator;

public class TotalAscCompareImpl implements Comparator<GradeVO>{
	/*
	 * 총점 오름차순
	 * */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		return (first.getTot() > second.getTot()) ? 
				-1 : first.getTot() < second.getTot() ? 1 : 0 ;
	}
	
}
