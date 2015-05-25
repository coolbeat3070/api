package api.lang.object;
/*
 * Object 클래스 - 모든 클래스의 조상
 - 자바에서 모든 클래스는 Object 클래스를 상속받는다.
 - 모든 클래스 객체는 이 클래스 타입으로 형변환을 한다.
 - 가장 상위에 있는 공통 데이터 타입이다.
 - 기본 primitive 데이터 타입을 받지 않고 다양한 모든 타입을 받으려면
	인수의 타입을 Object 로 지정해야 합니다.
	이 예는 Collection 에서 많이 발견됨. 
 * */
/*
Object 의 11 메소드

protected Object clone(); // copy
boolean equals(Object obj);
protected void finalize(); // called by the garbage collector
Class<?> getClass(); 
int hashCode();
String toString();
void notify(); // all thread ~~
void notifyAll(); // single thread ~~
void wait(); // currentthread ~~
void wait(long timeout); // currentthread ~~
void wait(long timeout, int nanos); // currentthread ~~

이 중 thread, garbage collector  관련한 메소드와
	copy 메소드는 거의 사용되지않고
	equals(Object o) 와 toString() 이 많이 사용됨.
 * */
public class ObjectSyntax {

}
