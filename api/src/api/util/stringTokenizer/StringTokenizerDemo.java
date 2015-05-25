package api.util.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	StringTokenizer tok;
	public StringTokenizerDemo(String str) {
		tok = new StringTokenizer(str);
	}
	public StringTokenizerDemo(String str, String delim) {
		tok = new StringTokenizer(str, delim);
	}
	public StringTokenizerDemo(String str, String delim, Boolean returnDelims) {
		tok = new StringTokenizer(str, delim, returnDelims);
	}
	public void print(){
		System.out.println("Token count : "+ tok.countTokens());
		while(tok.hasMoreTokens()){
			String token = tok.nextToken();
			System.out.println(token);
		}
		System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		StringTokenizerDemo stex = new StringTokenizerDemo("Happy Day");
		stex.print();
	}
}
