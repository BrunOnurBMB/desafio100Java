package matrizes;

import java.util.Scanner;

public class AboveDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, sum;
		sum = 0;
		
		System.out.println("What is the order of the matrix?");
		N = sc.nextInt();
		
		int mat[][] = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("--- New element ---");
			for (int j = 0; j < N; j++) {
				System.out.println("Element [" + i + "," + j+"] ");
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		
		for (int i = 0; i < N; i++) {	
			for (int j = i + 1; j < N; j++) {
					sum += mat[i][j];
				}
			}
		
		System.out.println("Sum of the elements above the principal diagonal = " + sum);
		
		sc.close();
	}

}
