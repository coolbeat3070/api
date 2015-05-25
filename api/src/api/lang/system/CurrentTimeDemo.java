package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeDemo {
	long curTime = 0;

	public String getCurTime() {
		long curTime = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		String nowTime = sdf.format(new Date(curTime));
		return nowTime;
		
	}

	public void setCurTime(long curTime) {
		this.curTime = curTime;
	}
	public static void main(String[] args) {
		CurrentTimeDemo ct = new CurrentTimeDemo();
		System.out.println("\n\n 현재시간 ? "+ct.getCurTime());
	}
}
