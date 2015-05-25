package api.lang.string;
/*
split(",")  주어진 문자열을 , 로 잘라서
배열에 담아 리턴함.
 * */
import java.lang.String;
import java.lang.System;
import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for(int i=0;i<fruits.length;i++){
			System.out.print("\t"+fruits[i]);
		}
		
		System.out.println();
		System.out.println();
		System.out.print("split(String, int) 출력결과 :");
		String[] fruits2 = fruit.split(",", 2);
		System.out.println(Arrays.toString(fruits2));
	}
}
