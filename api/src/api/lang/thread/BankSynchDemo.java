package api.lang.thread;
/*
 * 실행안됨..구현 보류
 * */
public class BankSynchDemo {
	public static void main(String[] args) {
		Customer[] customers = new Customer[3];
		customers[0] = new Customer(new Account("아이언"),"강남점",100);
		customers[0].start();
		customers[1] = new Customer(new Account("헐크"),"종론점",100);
		customers[1].start();
		customers[2] = new Customer(new Account("토르"),"마포점",100);
		customers[2].start();
	}
}
class Account{
	String name;
	int total;
	public Account() {
		this("");
	}
	public Account(String name) {
		this.name = name;
	}
	/*
	 * money : 입금액
	 * location : 은행 지점
	 * */
	public synchronized void deposit(int money, String location){
		total += money;
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			System.out.println("["+location+"]" + 
					+money +"원 입급 / 총액 :"
					+ total +"원");
		}
	}
}
class Customer extends Thread{
	Account accout;
	int money;
	public Customer() {
		this(null,"",0);
	}
	public Customer(Account account, String str, int money) {
		super(str);
		this.accout = account;
		this.money = money;
	}
	public void run(){
		accout.deposit(money, this.getName());
	}
}
