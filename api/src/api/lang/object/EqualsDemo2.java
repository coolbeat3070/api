package api.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1555555");
		Person p2 = new Person("800101-1555555");
		String result = "";
		result = p1==p2 ? "p1 과 p2 는 같은 사람" : "p1 과 p2 는 다른 사람";
		System.out.println("p1==p2 의 결과값 : " + result );
		result = p1.equals(p2) ? "p1 과 p2 는 같은 사람" : "p1 과 p2 는 다른 사람";
		System.out.println("p1.equals(p2) 의 결과값 : " + result );
	}
}
class Person{
	private String ssn; // 주민번호
	public Person(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person){
			return ssn == ((Person)obj).ssn;
		}else{
			return false;
		}
		
	}
	
}
