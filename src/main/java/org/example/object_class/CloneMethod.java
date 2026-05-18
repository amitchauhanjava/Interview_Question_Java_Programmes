package object_class;

public class CloneMethod implements Cloneable {
	int id;

	public CloneMethod(int id) {
		super();
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {

		CloneMethod cm1 = new CloneMethod(1);
		CloneMethod cm2 = (CloneMethod) cm1.clone();

		System.out.println(cm1.id);
		System.out.println(cm2.id);

	}

}
