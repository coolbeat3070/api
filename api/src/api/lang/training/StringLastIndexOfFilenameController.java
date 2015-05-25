package api.lang.training;

public class StringLastIndexOfFilenameController {
	 public static void main(String[] args) {
	        final String FPATH = "/home/user/index.html";
	        StringLastIndexOfFilename myHomePage = new StringLastIndexOfFilename(FPATH, '/', '.');
	        System.out.println("Extension = " + myHomePage.extension());
	        System.out.println("Filename = " + myHomePage.filename());
	        System.out.println("Path = " + myHomePage.path());
	    }
}
