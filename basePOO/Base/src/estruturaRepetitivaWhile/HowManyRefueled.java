package estruturaRepetitivaWhile;

import java.util.Scanner;

public class HowManyRefueled {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Cod = sc.nextInt();

		int somaAlcool = 0;
		int somaGasolina = 0;
		int somaDiesel = 0;

		while (Cod < 4) {
			somaGasolina += (Cod == 1) ? 1 : 0;
			somaAlcool += (Cod == 2) ? 1 : 0;
			somaDiesel += (Cod == 3) ? 1 : 0;
			
			if(Cod != 1 && Cod != 2 && Cod != 3) {
				System.out.println("Valor inválido!");
			}
		
			Cod = sc.nextInt();
		}

		System.out.println("Muito Obrigado!!");
		System.out.printf("Alcool: %d\n", somaAlcool);
		System.out.printf("Gasolina: %d\n", somaGasolina);
		System.out.printf("Diesel: %d\n", somaDiesel);
		
		sc.close();
	}
}