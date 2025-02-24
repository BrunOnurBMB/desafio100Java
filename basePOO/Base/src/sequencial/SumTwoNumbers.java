package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numberOne, numberTwo;
		int sum;
		
		System.out.print("Enter the first number: ");
		numberOne = sc.nextInt();
		System.out.print("Enter the second number: ");
		numberTwo = sc.nextInt();
		sum = (numberOne + numberTwo);
		
				
		System.out.println("The sum of number one: " + numberOne + " and number two: " + numberTwo + " is =  " + sum);
		
		sc.close();
	}

}
