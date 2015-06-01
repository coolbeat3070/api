package aoi.io.file;

import java.io.File;
/*
 * 폴더생성 실패 !
 * */
public class MakeDirectoryDemo {
	public static void main(String[] args) {
		File dname = new File("c:/happy");
		boolean flag = false;
		flag = dname.mkdir();
		if(dname.mkdir()){
			System.out.println("폴더생성");
		}else{
			System.out.println("폴더생성 실패 !");
		}
	}
}
