package singleton_class;

public class Emp implements Cloneable {
	
	String name;

	public Emp(String name) {
		super();
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp e1 = new Emp("Amit");
		Emp e2 = (Emp) e1.clone();
		System.out.println(e1.name);
		System.out.println(e2.name);
	}

}
