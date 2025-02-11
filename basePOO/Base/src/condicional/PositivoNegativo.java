package condicional;

import java.util.Locale;
import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A;
		String msg;
		
		System.out.println("Insira um valor positivo ou negativo:");
		A = sc.nextInt();
	
		msg = (A > 0) ? "Positivo" : "Negativo" ;
		
		System.out.println("O numero inserido foi " + A);
		System.out.println("E ele é um numero " + msg);
		sc.close();

	}

}