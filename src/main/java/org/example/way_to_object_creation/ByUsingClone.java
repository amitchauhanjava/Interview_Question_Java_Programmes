package way_to_object_creation;

class Stud implements Cloneable {
	long id;
	String name;
	String birth;

	public Stud(long id, String name, String birth) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException  {
		return super.clone();
	}

}

public class ByUsingClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Stud std1 = new Stud(1001, "Amit Chauhan", "02/05/1997");
		Stud std2 = (Stud) std1.clone();
		Stud std3 = (Stud) std1.clone();
		
		System.out.println("Objects of new keyword: "+std1.id+" "+std1.name+" "+std1.birth);
		System.out.println("Objects of clone method: "+std1.id+" "+std1.name+" "+std1.birth);
		System.out.println(std1.id+" "+std1.name+" "+std1.birth);
	}
}
