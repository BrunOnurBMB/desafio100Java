package estruturaRepetitivaWhile;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um valor para o eixo X: ");
		int eixoX = sc.nextInt();
		System.out.print("Insira um valor para o eixo Y: ");
		int eixoY = sc.nextInt();
		String resp = null;

		while (eixoX != 0 && eixoY != 0) {

			resp = (eixoX > 0 && eixoY > 0) ? "Primeiro quadrante" :
				(eixoX < 0 && eixoY < 0) ? "Quarto quadrante" :
				(eixoX < 0 && eixoY > 0) ? "Terceiro quadrante" :
				"Segundo quadrante";
			
			System.out.println(resp);
			
			System.out.println();
			
			System.out.print("Insira um novo valor pra o eixo X: ");
			eixoX = sc.nextInt();
			System.out.print("Insira um novo valor pra o eixo Y: ");
			eixoY = sc.nextInt();
		}
		System.out.println("Programa finalizado!");
		
		sc.close();
	}

}
