package api.lang.thread;
/*
 * 스레드 동기화
 * - 멀티스레드 프로그램에서 동기화 이슈에 대한 처리가 필요
 * - 다수의 스레드가 한 번에 작업에 투입되면서 발생할 수 있는
 *   공유자원의 훼손을 막고 안정성을 유지하기 위함이다.
 * */
public class AtmUserThreadDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		AtmUser user1 = new AtmUser(atm, "손님-1");
		AtmUser user2 = new AtmUser(atm, "손님-2");
		AtmUser user3 = new AtmUser(atm, "손님-3");
		AtmUser user4 = new AtmUser(atm, "손님-4");
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
	}
	
}
class AtmUser extends Thread{
	/*
	 *  공유객체
	 * */
	Atm atm;
	String name;
	public AtmUser() {
		this(null,"");
	}
	public AtmUser(Atm atm, String name) {
		super();
		this.atm = atm;
		this.name = name;
	}
	public void run(){
		atm.inchul(name);
	}
	
}
class Atm{
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