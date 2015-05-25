package api.lang.object;

public class ToStringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("spade",3);
		Card card2 = new Card("heart",7);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		// 기본 toString 은 클래스이름 + "@" + hashCode() 형태로 출력
		// 따라서 오버라이딩이 되어야 한다.
		
	}
}
class Card{
	String kind;
	int number;
	public Card() {
		this("",0);
	}
	public Card(String string, int i) {
		this.kind = string;
		this.number = i;
	}
	// toString() 오버라이딩은 일단 하기 前  결과를 본 후
}