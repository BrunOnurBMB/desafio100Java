package condicional;

import java.util.Locale;
import java.util.Scanner;

public class CalculaImposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto, isento;
		isento = 2000.00;
		
		System.out.println("Informe o salário em Rombus:");
		salario = sc.nextDouble();
		
		imposto = (salario <= 2000.00) ? 0 :
				  (salario <= 3000.00) ? (salario - isento) * 0.08 :
				  (salario <= 4500.00) ? (salario - 3000.00) * 0.18 + 1000.00 * 0.08 :
				  (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
