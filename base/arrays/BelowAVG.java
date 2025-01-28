package Vet;

import java.util.Locale;
import java.util.Scanner;

public class BelowAVG {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double avg = 0;
		
		System.out.println("How many elemnts does the array have?");
		N = sc.nextInt();
		sc.nextLine();
		System.out.println("-------------");
		
		double vet[] = new double[N];
		double vetBelow[] = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Add a number:");
			vet[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vet.length; i++) {
			avg = avg + vet[i];
		}
		avg = avg / N;
		
		System.out.println("-------------");
		System.out.println("Average of the array = " + String.format("%.3f", avg));
		System.out.println("Elements below the average:");
		for (int i = 0; i < N; i++) {
			if (vet[i] < avg) {
				vetBelow[i] = vet[i];
				System.out.println(String.format("%.1f", vetBelow[i]));
			}
			
		}
		sc.close();	
	}

}
