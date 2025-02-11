package array;

import java.util.Scanner;

public class Negatives {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("How many number u wanna add?");
		N = sc.nextInt();
		
		double[] vet  = new double[N];
		
		System.out.print("insert a number: ");
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
			System.out.print("insert a new number: ");
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