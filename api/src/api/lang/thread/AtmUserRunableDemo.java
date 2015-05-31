package api.lang.thread;
/*
 * 스레드 동기화
 * - 멀티스레드 프로그램에서 동기화 이슈에 대한 처리가 필요
 * - 다수의 스레드가 한 번에 작업에 투입되면서 발생할 수 있는
 *   공유자원의 훼손을 막고 안정성을 유지하기 위함이다.
 * */
public class AtmUserRunableDemo {
	public static void main(String[] args) {
		Atm2 atm = new Atm2();
		Runnable user1 = new AtmUser2(atm, "손님-1");
		Runnable user2 = new AtmUser2(atm, "손님-2");
		Runnable user3 = new AtmUser2(atm, "손님-3");
		Runnable user4 = new AtmUser2(atm, "손님-4");
		Thread thread1 = new Thread(user1);
		thread1.start();
		Thread thread2 = new Thread(user2);
		thread2.start();
		Thread thread3 = new Thread(user3);
		thread3.start(); 
		Thread thread4 = new Thread(user4);
		thread4.start();
	}
	
}
class AtmUser2 implements Runnable{
	/*
	 *  공유객체
	 * */
	Atm2 atm;
	String name;
	public AtmUser2() {
		this(null,"");
	}
	public AtmUser2(Atm2 atm, String name) {
		super();
		this.atm = atm;
		this.name = name;
	}
	@Override
	public void run() {
		atm.inchul(name);
	}
	
}
class Atm2{
	public synchronized void inchul(String name){
		System.out.println(name+" 인출요청함");
		for(int i=0;i<= 1000000000;i++){
			if(i==10000){
				System.out.println(name + "인출중..");
			}
		}
		System.out.println(name + " 인출해 나감");
	}
}