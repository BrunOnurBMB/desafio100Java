package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class CalculateSalary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hour, func;
		double money, pay;
		
		System.out.println("Please provide the number of employees, their hours worked, and the hourly rate for each: ");
		func = sc.nextInt();
		hour = sc.nextInt();
		money = sc.nextDouble();
		pay = hour * money;
		System.out.println("Number = " + func);
		System.out.println("Salary = " + String.format("%.2f", pay));
		
		sc.close();
	}

}
