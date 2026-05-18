package object_class;

public class ToStringMethod {
	
	int id;
	String name;

	public ToStringMethod(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ToStringMethod [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		ToStringMethod ts = new ToStringMethod(12, "Amit");
		System.out.println(ts);
	}

}
