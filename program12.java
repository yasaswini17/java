package programs;

import java.util.Scanner;

public class program12 {
	public static double Average(int grades[], int max ) {
		 int sum=0;
		 double average=0.0;

		 for (int i=1;i<max;i++){ // loop and calculate the Average
		 sum+=grades[i];
		 average=sum/(i);
		 }
		 return average; 

		 }

		 public static void main(String[] args) {

		 Scanner input=new Scanner(System.in); 

		 int i, grades[]; 
		 grades=new int[20];

		 for (i=0;i<20;i++){ 
		 System.out.printf("Enter Grade: ");
		 grades[i]=input.nextInt();
		 if (grades[i]==-1) break;
		 }
		 System.out.printf("%.2f", Average(grades, i-1));
		 }
		}
		