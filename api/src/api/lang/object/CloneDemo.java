package api.lang.object;

import java.util.Arrays;

public class CloneDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// 배열 arr 을 복제하기
		
		int[] arr2 = arr.clone();
		
		System.out.println("for loop 출력");
		for(int i=0;i<arr.length;i++){
			System.out.print( arr[i]+"\t");
		}
		System.out.println();
		System.out.println("=================");
		System.out.println("Arrays 로 출력");
		System.out.println("arr 의 내용 :"+Arrays.toString(arr));
		System.out.println("arr2 의 내용 :"+Arrays.toString(arr2));
		
		
		
	}
}
