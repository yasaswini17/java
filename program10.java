package programs;

import java.util.Scanner;

public class program10 {
	public static void main (String [] args) {
		  Scanner scnr = new Scanner(System.in);
		  double piVal = 3.14;
		  double sphereVolume;
		  double sphereRadius;

		  sphereRadius = scnr.nextInt();

		  sphereVolume = (4.0 / 3.0) * piVal * (sphereRadius * sphereRadius * 
		  sphereRadius);

		  System.out.println(sphereVolume);
		   }
}
