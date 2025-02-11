package matrix;

import java.util.Locale;
import java.util.Scanner;

public class GenralMatrix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, choice;
		double sum;
		sum = 0;
		choice = 0;
		System.out.println("Ehat is the order of the matrix?");
		N = sc.nextInt();

		double mat[][] = new double[N][N];

		for (int i = 0; i < N; i++) {
			System.out.println("--- Add a new row elemnt ---");
			for (int j = 0; j < N; j++) {
				System.out.println("Element [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}

		System.out.println();
		System.out.println("---------");
		System.out.println();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0) {
					sum += mat[i][j];
				}

			}
		}
		System.out.println("Sum of the positive values: " + sum);

		System.out.println();
		System.out.println("---------");
		System.out.println();

		System.out.println("Choice one row of: " + N);
		choice = sc.nextInt();

		System.out.print("Chosen row: ");
		for (int i = 0; i < N; i++) {

			System.out.print(mat[choice][i] + " ");
		}

		System.out.println();
		System.out.println("---------");
		System.out.println();

		System.out.println("Choice one column of: " + N);
		choice = sc.nextInt();

		System.out.println("Chosen column: ");
		for (int i = 0; i < N; i++) {

			System.out.println(mat[i][choice] + " ");
		}

		System.out.println();
		System.out.println("---------");
		System.out.println();

		System.out.print("Main diagonal: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] == mat[i][i]) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}

		System.out.println();
		System.out.println("---------");
		System.out.println();

		System.out.println("Altered Matrix:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
