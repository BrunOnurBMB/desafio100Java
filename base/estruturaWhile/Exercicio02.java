package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int EixoX = sc.nextInt();
		int EixoY = sc.nextInt();
		
		while(EixoX != 0 && EixoY != 0) {
			
			if(EixoX > 0 && EixoY > 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if(EixoX > 0 && EixoY < 0) {
				System.out.println("Quarto Quadrante");
			}
			else if(EixoX < 0 && EixoY > 0) {
				System.out.println("Quadrante Dois");
			}
			else {
				System.out.println("Quadrante três");
			}	
			
			EixoX = sc.nextInt();
			EixoY = sc.nextInt();
		}
		sc.close();
	}

}
