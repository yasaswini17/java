package ifElse;

public class grading {
	public static void main(String[]args) {
		int marks = 96;
		if(marks>90 && marks<100) {
		System.out.println("A grade ");
		}
		else if(marks>80 && marks<90) {
		System.out.println("B grade ");
		}
		else if(marks>70 && marks<80) {
		System.out.println("C grade ");
		}
		else if(marks>60 && marks<70) {
		System.out.println("C grade ");
		}
		else {
		System.out.println("F grade");
		}
	}
}
