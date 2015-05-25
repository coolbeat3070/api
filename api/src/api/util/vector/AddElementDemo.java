package api.util.vector;

import java.util.Vector;

public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros = {"iron","thor","hulk","hawk"};
		
		Vector avengers = new Vector();
		/*벡터에 배열의 요소를 저장 addElements() */
		for(int i=0;i<heros.length;i++){
			avengers.addElement(heros[i]);
		}
		
		/*토르가 존재하는지 체크 contains() */
		String thor = "thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor);
			System.out.println("토르는 " +idx+1+ " 번째에 있습니다.");
		}else{
			System.out.println("토르는 없습니다.");
		}
		/*첫번째 요소 삭제 removeElementAt() */
		avengers.removeElementAt(0);
		
		System.out.println("삭제후 멤버 위치 인덱스 변화");
		
		for(int j=0;j<avengers.size();j++){
			System.out.println("Avengers 의 " + (j + 1)+
					"번째 멤버는 " + avengers.elementAt(j));
		}
		
	}
}
