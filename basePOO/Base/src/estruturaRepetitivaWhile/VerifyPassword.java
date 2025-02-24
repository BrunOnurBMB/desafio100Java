package estruturaRepetitivaWhile;

import java.util.Scanner;

public class VerifyPassword {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Senha = sc.nextInt();

		while (Senha != 2002) {
			System.out.println("Senha inválida! Acesso negado");
			Senha = sc.nextInt();
		}
		System.out.println("Senha válida! Acesso liberado");

		sc.close();
	}

}
