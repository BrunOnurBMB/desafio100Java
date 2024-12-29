package Vet;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
				
		System.out.println("How many numbers you wanna add?");
		N = sc.nextInt();
		sc.nextLine();
		
		int vet[] = new int [N];
		int vetCont[] = new int [N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Add a number:");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		
		int cont = 0;
		System.out.println("Even numbers:");
		for (int i = 0; i < N; i++) {
			if(vet[i] % 2 == 0) {
				vetCont[i] = vet[i]; 
			}
			
			if(vetCont[i] > 0){
				System.out.print(vetCont[i] + " ");
				cont = cont + 1; 
			}
		}
		System.out.println();
		System.out.println("Number of pairs = " + cont);
		sc.close();
	}

}
