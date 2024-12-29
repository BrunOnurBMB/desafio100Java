package estruturaSequencial001;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreaCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
				
		double pi, raio, area;
		pi = 3.14159;
		
		System.out.println("Insira o valor do raio:");
		raio = sc.nextDouble();
		
		area = pi * (raio * raio);
		System.out.println("O valor da área do circulo é de: " + String.format("%.4f", area));
		
		sc.close();
	}

}
