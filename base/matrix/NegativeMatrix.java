package matrizes;

import java.util.Scanner;

public class NegativeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, M, count;
		count = 0;
		
		System.out.println("How many rows does the matrix?");
		N = sc.nextInt();
		System.out.println("How many columns does the matrix?");
		M = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		int mat[][] = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			count = count + 1;
			for (int j = 0; j < M; j++) {
				System.out.println("Element [" + i + "," + j + "] ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Negative values:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		sc.close();
	}

}
