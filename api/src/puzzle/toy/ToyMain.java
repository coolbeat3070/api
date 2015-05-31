package puzzle.toy;

import java.util.List;

public class ToyMain {
	 public static void main(String[] args) {
	        
	    	ToyMachine c = new ToyMachine();
	         ToySpec spec = new ToySpec();
	         spec.setProperty("사용자", ToyUser.ADULT);
	         spec.setProperty("타입", ToyType.FIGURE);
	        
	         c.regist("스파이더맨", 5000, spec);
	         List<ToyVO> list = c.getAll();
	         for (ToyVO toy : list) {
	              System.out.println(toy);
	         }
	    }
}
