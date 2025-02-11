package matrix;

import java.util.Locale;
import java.util.Scanner;

public class SumRows {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, M, count;
		count = 0;

		System.out.println("How many rows does the matrix?");
		N = sc.nextInt();
		System.out.println("How many columns does the matrix?");
		M = sc.nextInt();

		double mat[][] = new double[N][M];
		double vetSum[] = new double[N];

		System.out.println();
		for (int i = 0; i < N; i++) {
			count = count + 1;
			System.out.println("Insert elements of the " + count + "st row:");
			for (int j = 0; j < M; j++) {
				mat[i][j] = sc.nextDouble();
			}
			System.out.println();
		}

		System.out.println("Array generation");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				vetSum[i] = vetSum[i] + mat[i][j];
			}
			System.out.println(vetSum[i]);
		}

		sc.close();
	}
}
