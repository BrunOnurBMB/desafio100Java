package Vet;

import java.util.Locale;
import java.util.Scanner;

public class HighstPosition {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, position;
		double higstValue;
		position = 0;
		higstValue = 0.0;
		
		System.out.println("How many numbers you wanna add?");
		N = sc.nextInt();
		sc.nextLine();
		
		double vet[] = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Enter a new floating-point number:");
			vet[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < N; i++) {
			if(vet[i] > higstValue) {
				higstValue = vet[i];
				position = i;
			}
		}
		
		System.out.println("Higst value = " + String.format("%.1f", higstValue));
		System.out.print("Highst position = " + position);
		
		sc.close();
		
	}
	
}
