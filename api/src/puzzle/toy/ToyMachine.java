package puzzle.toy;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ToyMachine {
	private Vector<Toy> toys;
    private Toy toy;
   
    /**생성자*/
    public ToyMachine(){
         this(10, 5);
    }
    public ToyMachine(int capa , int increment){
         toys = new Vector<>(capa, increment);
    }
    public void regist(String name, int price, ToySpec spec){
         Toy toy = new Toy(name,price,spec);
         toys.addElement(toy);
    }
    public Vector<Toy> searchName(String name){
         Vector<Toy>catchToys = new Vector<Toy>();
         for (int i = 0; i < toys.size(); i++) {
             
              while (toy instanceof Toy) {
                   if (toy.getName().equalsIgnoreCase(name)) {
                        catchToys.add(toy);
                   }
                   System.out.println(toy.getName()+"인형");
              }
         }
         return catchToys;
    }
    public List<Toy> searchSpec(ToySpec searchSpec){
         List<Toy>catchToys = new ArrayList<Toy>();
         Enumeration<Toy>e = toys.elements();
         while (e.hasMoreElements()) {
              Toy toy = (Toy) e.nextElement();
              ToySpec toySpec = toy.getSpec();
              if (toySpec.equals(searchSpec)) {
                   catchToys.add(toy);
              }
         }
         return catchToys;
    }
    public List<Toy> getAll(){
         return toys;
    }
   
    public static void main(String[] args) {
        
    	ToyMachine c = new ToyMachine();
         ToySpec spec = new ToySpec();
         spec.setProperty("사용자", ToyUser.ADULT);
         spec.setProperty("타입", ToyType.FIGURE);
        
         c.regist("스파이더맨", 5000, spec);
         List<Toy> list = c.getAll();
         for (Toy toy : list) {
              System.out.println(toy);
         }
    }
}
