package array;

import java.util.Scanner;

public class SumVet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("How many values will each array have?");
		N = sc.nextInt();
		
		int vetA[] = new int[N];
		int vetB[] = new int[N];
		int vetResult[] = new int[N];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Enter the values of the first array: ");
			vetA[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		for (int i = 0; i < vetB.length; i++) {
			System.out.println("Enter the values of the second array: ");
			vetB[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Result array: ");
		for (int i = 0; i < N; i++) {
			vetResult[i] = vetA[i] + vetB[i];
			System.out.println(vetResult[i]);
		}
		sc.close();
	}
}