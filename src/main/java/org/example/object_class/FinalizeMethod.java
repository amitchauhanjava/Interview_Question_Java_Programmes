package object_class;

public class FinalizeMethod {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is garbage collected!");
	}

	public static void main(String[] args) {
		FinalizeMethod f = new FinalizeMethod();
		f=null;
		System.gc();
		System.out.println("Test");
	}
}
