package ifElse;

public class blooddonaion {
	public static void main(String[] args) {
		int age=21, weight=42;
		if(age>=18 && weight>=40) {
			System.out.println("you are eligible");
			}
		else if(age>=18 && weight<40) {
			System.out.println("you are not eligible");
		}
		else if(age<18 && weight>=40) {
			System.out.println("you are not eligible");
		}
		else {
			System.out.println("you are not eligible");
		}
	}

}
