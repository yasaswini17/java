package programs;

import java.util.Scanner;

public class program8 {
	 public static void main(String[] args) { 
		 Scanner input=new Scanner (System.in); 
		 int firstNum=0;
		 int secondNum=0; 

		 System.out.println("Enter First Number: ");
		 firstNum=input.nextInt(); 

		 System.out.println("Enter Second Number: ");
		 secondNum=input.nextInt(); 

		  if (number(firstNum,secondNum)){
		System.out.println(firstNum + "is a multiple of" + secondNum);
		}
		else{
		System.out.println(firstNum + "is not a multiple of" + secondNum); 
		 }
		}
		public static boolean number(int num1,int num2)
		{
		if(num1%num2==0)
		return true;
		else
		return false;
		}
		}


