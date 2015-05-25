package api.util.vector;

import java.util.Vector;

public class AddDemo {
	public static void main(String[] args) {
		String[] chatt = new String[3];
		String id = "sky";
		int age = 27; // 나이
		Boolean male =true;
		
		Vector<String> vt = new Vector<String>();
		String nick = new String("sky");
		Boolean gender = new Boolean(false);
		
		
		vt.add(new String("sky"));
		vt.add(String.valueOf(23));
		vt.add(String.valueOf(gender));
		
	}
}
