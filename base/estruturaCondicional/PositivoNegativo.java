package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A;
		
		System.out.println("Insira um valor positivo ou negativo:");
		A = sc.nextInt();
		if (A > 0 ) {
			System.out.println("Positivo!");
		}else{
			System.out.println("Negativo!");
		}
		
		sc.close();

	}

}
