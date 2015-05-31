package api.util.collections;

import java.util.Comparator;

public class TotalDescCompareImpl implements Comparator<GradeVO> {
	/*
	 * 문자열 비교때는 compareTO 를 쓰고,
	 * 숫자값 비교때는 -1, 0, 1 리턴
	 * -1 : 작다
	 * 0 : 같다
	 * 1 : 크다
	 * */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		return first.getTot() > second.getTot() ?
				-1 : first.getTot() < second.getTot() ? 1 : 0;
	}

}
