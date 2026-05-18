package singleton_class;

public class SingleTon2 {
	
	public static final SingleTon2 INSTANCE = new SingleTon2();

	public SingleTon2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingleTon2 getInstance() {
		return INSTANCE;
	}

}
