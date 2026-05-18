package singleton_class;

// Eager Initialization
 public class SingletonClass {
	 
	 // Eagerly created instance
	public static final SingletonClass INSTANCE = new SingletonClass();
	
	// Private constructor to prevent instantiation
	public SingletonClass() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonClass getInstance() {
		return INSTANCE;
	}

}
