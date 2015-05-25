package api.util.arrayList;
/*
java.lang.ArrayList  는 Object 배열을 이용해서
데이터를 순차적으로 저장하는 공간.
첫번째로 저장한 공간은 인덱스 0번 값을 갖는다.
배열에 더 이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성해서
기존의 배열에 저장된 내용을 새로운 배열에 복사한 다음에
저장한다.
 * */
/*
java.lang.Vector 과 차이점
- Vector 은 멀티스레드에 대한 동기화가 되어 있으나
- java.lang.ArrayList 는 동기화가 되어 있지 않다.
 * */
/*
 ArrayList 클래스
 1. ArrayList와 Vector Class는 List를 크기 변경이 가능한 배열로 구현한 것으로
  차이점은 Vector 클래스의 객체는 원래 기본적으로 동기화 되지만, 
  ArrayList는 그렇지 않다.
  
 2. 비 동기화된 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
  스레드들이 컬렉션을 공유하 지 않는 프로그램에서는 
  일반적으로 ArrayList를 Vector보다 더 선호하며 
  ArrayList는 동기화를 고려하지 않는 Vector처럼 
  동작함으로써 스레드 동기화에 따르는 부담을 가지지 않기 때문에
   Vector보다 빠 르게 실행된다.
 * */
public class ArrayListSyntax {

}
