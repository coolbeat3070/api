package api.util.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ArraysDemo {
Vector<Integer> vec = new Vector<Integer>();
	
	public Vector<Integer> getDescSort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int k:arr){
			vec.add(k);
		}
		return vec;
	}

// commit 때문에..
	
	public Vector<Integer> getAscSort(int[] arr){
	/*public void setAscSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[j]>arr[j+1]){
					int tmp;
					tmp = arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
		이 과정을 Arrays 클래스로 한 줄 처리
	*/
		Arrays.sort(arr);
		for(int k : arr){
			vec.add(k);
		}
		return vec;
		
	}
	public static void main(String[] args) {
		ArraysDemo util = new ArraysDemo();
		ArraysDemo util2 = new ArraysDemo();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int[] arr = {8,6,2,5,7,1};
		list = util.getAscSort(arr);
		list2 = util2.getDescSort(arr);
		System.out.println("오른차순 정렬 : "+list.toString());
		System.out.println("내림차순 정렬 : "+list2.toString());
	}
}
