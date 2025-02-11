package array;

import java.util.Locale;
import java.util.Scanner;

public class VetSumAndAVG {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double SUM, AVG;
		SUM = 0.0;
		AVG = 0.0;
		
		System.out.println("How many numbers you wanna add?");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("insert a number:");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			SUM = vet[i] + SUM;
			AVG = SUM / vet.length;
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		
		System.out.println();
		System.out.println("Sum = " + String.format("%.1f", SUM));
		System.out.println("AVG = " + String.format("%.1f", AVG));
		
		sc.close();
	}
}