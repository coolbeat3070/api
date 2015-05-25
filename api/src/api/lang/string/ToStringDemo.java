package api.lang.string;
/*
toString()
String 인스턴스에 저장되어 있는 문자열을 리턴
 * */
public class ToStringDemo {
	 public static void main(String[] args) {
	        double d = 858.48;
	        String s = Double.toString(d);
	        
	        int dot = s.indexOf('.');
	        
	        System.out.println(dot + " digits " +
	            "before decimal point.");
	        System.out.println( (s.length() - dot - 1) +
	            " digits after decimal point.");
	    }
}
