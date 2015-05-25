package api.lang.math;

import java.util.Scanner;

public class RandomDemo {
	public static void main(String[] args) {
		int  com = (int)(Math.random( )*10) +1;  //1~100사이 숫자
		int  my=0;
		
		Scanner  sc = new  Scanner(System.in) ;
		int i=0 ;
		while( true) {
		   i++; 
		   System.out.print( i +"번째 숫자입력? " ) ;
		   my= sc.nextInt();
			if (my == com) {
				System.out.println("컴난수=" + com );
				System.out.println("빙고정답입니다");
				break;
			}
		   if( i==3) break ;
		} //while end
	  } //main end
}
