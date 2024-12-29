package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X, Y;
		
		System.out.println("insira os valores do eixo X e depois do eixo Y:");
		X = sc.nextDouble();
		Y = sc.nextDouble();
		
		if (X == 0.0 && Y == 0.0) {
			System.out.println("Origem");
		}else if(X == 0 && Y > 0 || X == 0 && Y < 0) {
			System.out.println("Eixo X");
		}else if (X > 0 && Y == 0 || X < 0 && Y == 0) {
			System.out.println("Eixo Y");
		}else if(X > 0 && Y > 0) {
			System.out.println("Q1");
		}else if(X > 0 && Y < 0) {
			System.out.println("Q4");
		}else if(X < 0 && Y > 0) {
			System.out.println("Q2");
		}else {
			System.out.println("Q3");
		}
		
		sc.close();
	}

}
