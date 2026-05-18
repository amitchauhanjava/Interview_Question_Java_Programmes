package typecasting;

public class TypeCasting {
	
	public static void main(String[] args) {

		// Widening
		int num = 123;
		long num1 = num;
		float f = num;
		double d = num;

		System.out.println(num);
		System.out.println(num1);
		System.out.println(f);
		System.out.println(d);

		// Narrowing
		float ft = 98.32f;
		int data = (int)ft;

		System.out.println(ft);
		System.out.println(data);
	}

}