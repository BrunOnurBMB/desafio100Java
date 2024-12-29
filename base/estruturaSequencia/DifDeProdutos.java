package estruturaSequencial001;

import java.util.Locale;
import java.util.Scanner;

public class DifDeProdutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, Dif;
		
		System.out.println("Informe 4 valores inteiros, positivos ou negativos:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		Dif = (A*B)-(C*D);
		System.out.println("Diferença = " + Dif);
		
		sc.close();

	}

}
