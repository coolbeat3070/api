package api.lang.object;
/*

 * */
public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		
		String result = "";
		
		result = t1.equals(t2) ? "t1 과 t2 는 동일" : "t1 과 t2 는 다름";
		/*
		if(t1.equals(t2)){
			System.out.println();
		}else{
			System.out.println();
		}
		*/
		System.out.println("생성자를 통해 생성된 참조변수 값의 비교 :"+result);
		
		t2 = t1;
		result = t1.equals(t2) ? "t1 과 t2 는 동일" : "t1 과 t2 는 다름";
		System.out.println("참조변수값을 다른 참조변수에 할당했을 경우 :" + result);
		
	//	Object o = new Object(); 이클립스 메소드 체크
		
		
	}
}
class Temp{
	int temp;
	public Temp(int num) {
		this.temp = num;
	}
}
