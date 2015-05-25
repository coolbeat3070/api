package api.lang.string;

public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		System.out.println(
				"Hello".equals("hello") ? "true" : "false" );
		System.out.println(
				"Hello".equalsIgnoreCase("hello") ? "true" : "false");
		
	}
}
