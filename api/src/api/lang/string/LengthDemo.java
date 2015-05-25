package api.lang.string;
/*
length() : String 문자열의 길이를 구하는 메소드
 * */
public class LengthDemo {
	public static void main(String[] args) {
        String temp = "자바 API 학습";
        int len = temp.length();  
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
            		temp.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        String reverseTemp = new String(charArray);
        System.out.println(reverseTemp);
    }
}
