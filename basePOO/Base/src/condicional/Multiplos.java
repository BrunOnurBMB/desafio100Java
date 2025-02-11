package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B;
		String msg;

		System.out.println("Insira dois numeros inteiros:");
		A = sc.nextInt();
		B = sc.nextInt();

		msg = (A % B == 0 || B % A == 0) ? "São multiplos" : "Não são multiplos";

		System.out.println(msg);

		sc.close();

	}

}
