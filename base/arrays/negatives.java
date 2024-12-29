package Vet;

import java.util.Scanner;

public class negatives {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("How many number u wanna add?");
		N = sc.nextInt();
		
		double[] vet  = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("insert a number:");
			vet[i] = sc.nextDouble();	
		}
		
		System.out.println();
		
		System.out.println("Negative numbers:");
		for (int i = 0; i < N; i++) {
			if(vet[i] < 0) {
				System.out.println(String.format("%.1f", vet[i]));
			}
		}
		
		sc.close();
	}

}
