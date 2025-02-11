package condicional;

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
		
		cost = (id == 1) ? many * 4.00 :
			   (id == 2) ? many * 4.50 :
			   (id == 3) ? many * 5.00 :
			   (id == 4) ? many * 2.00 :
			   (id == 5) ? many * 1.50 :
			   0.0;
		
		if (cost != 0.0) {
			System.out.println("Total: R$" + String.format("%.2f", cost));
		}
		else {
			System.out.println("Informe um id válido");
		}
		
		sc.close();
	}

}
