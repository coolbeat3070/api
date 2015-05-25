package api.util.vector;


public interface GradeService {
	public void input(GradeVO vo); //생략된 접근제어자는? abstract
	 public void print(); //생략된 접근제어자는? abstract
	 public void searchHak(); //생략된 접근제어자는? abstract
	 public void searchGradeByName(String name); //생략된 접근제어자는? abstract
	 public void descSortTot(); //생략된 접근제어자는? abstract
	 public void ascSortHak(); //생략된 접근제어자는? abstract
	 //특징 몸체가 없다 (abstract)
}
