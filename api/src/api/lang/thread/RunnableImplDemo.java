package api.lang.thread;
/*
 *  run() 을 호출하는 것은 클래스 내부의 메소드 호출
 *  start() 을 호출하는 것은 스레드가 작업을 실행하는데
 *  필요한 호출스택(call stack)을 생성한 다음, run() 을
 *  호출해서, 생성된 호출스택에 run() 을 저장시킨다.
 *  즉, 스레드를 구현한 클래스는 start()를 통해 시작시켜야 함. 
 * */
public class RunnableImplDemo  {
	public static void main(String[] args) {
		Runnable r = new RunnableImpl();
		/*생성자 Thread(Runnable target)*/
		Thread thr = new Thread(r);
		thr.start();
	}
	

}
class RunnableImpl implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			/*상속이 아니기때문에 super 사용할 수 없다.*/
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
