package puzzle.daycounter;

import java.util.NoSuchElementException;

public class DayCounter {
	public static void main(String[] args) {
		DayCounterVO vo = new DayCounterVO();
		int counter = 0;
		while(true){
			try {
				vo.token();
			} catch (NoSuchElementException e) {
				System.out.println("...");
			}
			counter++;
			if(counter==2)break;
		}
	}
}
