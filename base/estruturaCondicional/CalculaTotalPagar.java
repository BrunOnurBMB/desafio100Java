package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CalculaTotalPagar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, many;
		double cost;
		
		System.out.println("Informe o codigo do produto e sua quantidade:");
		id = sc.nextInt();
		many = sc.nextInt();
		
		if (id == 1) {
			cost = many * 4.00;
			System.out.println("Total: R$" + String.format("%.2f", cost));
		}else if (id == 2) {
			cost = many * 4.50;
			System.out.println("Total: R$" + String.format("%.2f", cost));
		}else if (id == 3) {
			cost = many * 5.00;
			System.out.println("Total: R$" + String.format("%.2f", cost));
		}else if (id == 4) {
			cost = many * 2.00;
			System.out.println("Total: R$" + String.format("%.2f", cost));
		}else if (id == 5) {
			cost = many * 1.50;
			System.out.println("Total: R$" + String.format("%.2f", cost));
		}
		
		sc.close();
	}

}
