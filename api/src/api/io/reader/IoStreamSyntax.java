package api.io.reader;
/*
IO Stream 
- IO : input + Output 약자
- 프로그램에 속한 데이터를 외부로 보내거나
 	가지지 않은 데이터를 내부로 받아들이는 동작
- 스트림(Stream) 은 FIFO(First In First Out) 구조
- 스트림은 단방향 구조로 한쪽으로만 흘러가는 방식
- input stream, output stream 두가지로 구성됨
보조스트림 : 실제 데이터를 입출력하는 기능은 없지만,
			스트림의 기능을 향상시키거나 새로운 기능을 
			추가시킴.
 * */
/*
Program 출력데이터 => (출력스트림)=>모니터, 디스크, 네트웍 (Destination)
모니터, 디스크,네트웍 (Destination) => (입력스트림 ) => Program

 * */
/*
Byte 기반 스트림 : 입출력 단위가 1 byte 
InputStream, OutputStream
 * */
/*
문자 기반 스트림 : char 가 2byte 이므로, 문자데이터
		입출력시에 어려움이 발생. 문자데이터 전용 스트림
Reader, Writer
 * */
public class IoStreamSyntax {

}
