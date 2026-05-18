package way_to_object_creation;

class Car {
	String model;
	Car(String model) {
		this.model = model;
	}
}

public class ClassLoaderExample {

	public static void main(String[] args) throws Exception {

		ClassLoader classLoader = ClassLoaderExample.class.getClassLoader();

	   Class<?> carClass = classLoader.loadClass("Car");
	   Car car = (Car) carClass.getDeclaredConstructor(String.class).newInstance("Audi"); // Creating an object using ClassLoader
        System.out.println(car.model); // Output: Audi
	}
}
