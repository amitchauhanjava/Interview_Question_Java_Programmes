package java8;

@FunctionalInterface
public interface MyInterfaceDemo {

	public void display();
	
	default void show() {
		System.out.println("Default Method..");
	}
	
	static void demo() {
		System.out.println("Static Method...");
	}
	
	class DemoClass implements MyInterfaceDemo {

		@Override
		public void display() {
			// TODO Auto-generated method stub
			
		}
		
		public static void main(String[] args) {
			
			MyInterfaceDemo.demo();
		}
		
		
	}

}
