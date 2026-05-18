package conditional;

public class StudentResult {
	
	public static void main(String[] args) {
		int rollNo=1001,english=78,maths=98,physics=98;
		int percentage = (english+maths+physics)*100/300;
		
		System.out.println("Percentage is: "+percentage);
		
		if (percentage<100 && percentage>90) {
			System.out.println("A+ Grade");
		} else if (percentage<90 && percentage>80) {
			System.out.println("B+ Grade");
		}
		else {
			System.out.println("You are passed");
		}
	}
}
