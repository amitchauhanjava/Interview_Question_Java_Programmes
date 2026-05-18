package multi_threading;

public class ThreadExample extends Thread {

	public void run() {
		System.out.println("Thread is running..");
	}
	
	public static void main(String[] args) {

		ThreadExample th = new ThreadExample();
		th.start();
	}
}
