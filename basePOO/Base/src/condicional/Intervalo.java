package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a;
		String msg;

		System.out.println("Inseira um número inteiro:");
		a = sc.nextDouble();

		msg = (a < 0 || a > 100) ? "Fora de intervalo!"	: 
			  (a > 0 && a <= 25) ? "Intervalo [0, 25]" :
			  (a > 25 && a <= 50) ? "Intervalo [25, 50]" :
			  (a > 50 && a <= 75) ? "Intervalo [50, 75]" :
			  "Intervalo [75, 100]";

		System.out.println(msg);

		sc.close();
	}

}
