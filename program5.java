package programs;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) { 
		 Scanner input=new Scanner (System.in); 
		 int num1=0, num2=0; // 
		 System.out.println("Numbers to perform calculations\n\n");

		 System.out.println("Enter First Number: ");
		 num1=input.nextInt(); 

		 System.out.println("Enter Second Number:");
		 num2=input.nextInt();


		 System.out.println(num1 + "+" + num2 + "=" +(num1 + num2));
		 System.out.println(num1 + "-" + num2 +"=" +(num1 - num2));
		 System.out.println(num1 + "*" + num2 +"=" +(num1 * num2));
		 System.out.println(num1 + "/" + num2 +"=" +(num1 / num2));
		 System.out.println(num1 + "mod" + num2 +"=" +(num1 % num2));
		 }
		} 


