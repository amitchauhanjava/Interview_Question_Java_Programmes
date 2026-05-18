package java8;

public class LambdaExample {
	
	public static void main(String[] args) {
		
		MyInterface i= ()-> {

			System.out.println("This is lambda expression");
			System.out.println("This is lambda expression");
		
		};
		i.display();
		
	};
	
//	  () -> {System.out.println("Lambda expression")}

}
