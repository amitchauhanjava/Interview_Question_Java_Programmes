package interview_asked_questions;

public class MainMethodQuestion {
	
	static public void main(String[] args) {
		
		System.out.println("Working..");
		 main(new Integer[]{1, 2, 3});
	}
	
	static public void main(Integer[] args) {
		
		System.out.println("Working..");
		
		   for (int num : args) {
	            System.out.println(num);
	        }
	}

}
