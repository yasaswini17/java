package programs;
import java.util.*;
public class program3 {
	 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 double celsius;
	 double tempInFahrenheit = 0.0;

	 celsius = (tempInFahrenheit - 32.0) * 5.0 / 9.0;
	 System.out.println("Enter the fahrenheit value");
	 tempInFahrenheit = input.nextDouble();

	 System.out.println("Temperature in celsius is: "+celsius);
	 }
	} 


