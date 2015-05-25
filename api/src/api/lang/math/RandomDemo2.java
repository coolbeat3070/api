package api.lang.math;

public class RandomDemo2 {
	public static void main(String[] args) {
        //세종류의 단어 목록 만들기
        String[] flowerList = {"튤립", "카라", "아이리스", "장미" };
        //각 단어목록에 몇개가 들어있는지 확인
        System.out.println("꽃 리스트 개수 : "+flowerList.length);
        //난수 세개를 발생시키기
        int flowerRand = (int)(Math.random()*flowerList.length);
        //구문작성
        System.out.println(flowerList[flowerRand]);
    }
}
