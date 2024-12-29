package estruturaSequencial001;

import java.util.Locale;
import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hour, func;
		double money, pay;
		
		System.out.println("informe a quantidade de funcionários, suas horas trabalhadas e quanto custa a hora de cada:");
		func = sc.nextInt();
		hour = sc.nextInt();
		money = sc.nextDouble();
		pay = hour * money;
		System.out.println("Number = " + func);
		System.out.println("Salary = " + String.format("%.2f", pay));
		sc.close();

	}

}
