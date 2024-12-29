package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Cod = sc.nextInt();
		
		int SomaAlcool = 0;
		int SomaGasolina = 0;
		int SomaDiesel = 0;
		
		while(Cod != 4) {
			
			if (Cod == 1) {
				SomaGasolina = SomaGasolina + 1;
			}
			else if(Cod == 2) {
				SomaAlcool = SomaAlcool + 1;
			}
			else if(Cod == 3) {
				SomaDiesel = SomaDiesel + 1;
			}else {
				System.out.println("Valor Inválido");
			}
			
			Cod = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado!!");
		System.out.printf("Alcool: %d\n", SomaAlcool);
		System.out.printf("Gasolina: %d\n", SomaGasolina);
		System.out.printf("Diesel: %d\n", SomaDiesel);
		sc.close();
	}

}
