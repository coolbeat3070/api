package api.util.stringTokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DatesDemo {
	
	public List<String> getDates(){
		List<String> dates = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer("2015/08//15","/");
		String year = st.nextToken();
		String month = st.nextToken();
		String day = st.nextToken();
		dates.add(year);
		dates.add(month);
		dates.add(day);
		return dates;
	}
	
	public static void main(String[] args) {
		DatesDemo stx2 = new DatesDemo();
		System.out.println("StringTokenizerEx2 의 출력값");
		for(int i=0;i<stx2.getDates().size();i++){
			System.out.println(stx2.getDates().get(i));
		}	
	}
}
