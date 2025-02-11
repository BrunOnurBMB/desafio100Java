package condicional;

import java.util.Locale;
import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X, Y;
		String msg;
		
		System.out.println("insira os valores do eixo X e depois do eixo Y:");
		X = sc.nextDouble();
		Y = sc.nextDouble();
		
		msg = (X == 0.0 && Y == 0.0) ? "Origem" :
			  (X == 0 && Y > 0 || X == 0 && Y < 0) ? "Eixo X" :
			  (X > 0 && Y == 0 || X < 0 && Y == 0) ? "Eixo Y" :
			  (X > 0 && Y > 0) ? "Quadrante 1" :
			  (X < 0 && Y > 0) ? "Quadrante 2" :
			  (X < 0 && Y > 0) ? "Quadrante 3" :
			  "Quadrante 4";
		
		System.out.println(msg);
		
		sc.close();
	}

}
