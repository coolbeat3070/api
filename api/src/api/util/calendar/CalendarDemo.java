package api.util.calendar;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = {"1월","2월","3월","4월","5월"
				,"6월","7월","8월","9월","10월","11월","12월"};
		Calendar date = Calendar.getInstance();
		
		System.out.print("날짜 :" );
		System.out.print(date.get(Calendar.YEAR) + "년");
		System.out.print(date.get(Calendar.MONTH) + "월");
		System.out.println(date.get(Calendar.DATE)+ "일");
		System.out.print("시간 :");
		System.out.print(date.get(Calendar.HOUR)+"시");
		System.out.print(date.get(Calendar.MINUTE)+"분");
		System.out.println(date.get(Calendar.SECOND)+"초");
		
		System.out.println("==1일후==");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("==7일전==");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 40);
		
		System.out.print("수정된 시간 :");
		System.out.print(date.get(Calendar.HOUR)+"시");
		System.out.print(date.get(Calendar.MINUTE)+"분");
		System.out.print(date.get(Calendar.SECOND)+"초");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년"
				+date.get(Calendar.MONTH) + "월"
				+date.get(Calendar.DATE)+ "일";
	}
}
