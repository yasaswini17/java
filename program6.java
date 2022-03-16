package programs;

import java.util.Scanner;

public class program6 {
	public static class Question1 { 
		 public static void main(String[] args) {
		 Scanner input=new Scanner (System.in); 

		 int num1=0, num2=0, bigger=0; 

		 System.out.println("Enter First Number: ");
		 num1=input.nextInt(); 

		 System.out.printf("Enter Second Number: ");
		 num2=input.nextInt(); 

		 if (num1>num2){ 
		 bigger=num1;
		 System.out.println("Number one is larger");
		 }
		 else if (num1<num2) {
		 bigger=num2;
		 System.out.println("Number two is larger");
		 }
		 else { 
		 System.out.println("The numbers are equal");
		 }
		 }
	}
}


