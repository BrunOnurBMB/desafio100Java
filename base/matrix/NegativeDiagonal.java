package matrizes;

import java.util.Scanner;

public class NegativeDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, count;
		count = 0;
		
		System.out.println("What is the order of the matrix?");
		N = sc.nextInt();
		sc.nextLine();
		
		int[][] mat = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("Element [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
			System.out.println("----- Next element -----");
		}
		System.out.println();
		
		System.out.println("Main diagonal :");
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("How many negative values are there = " + count);
		
		sc.close();

	}

}
