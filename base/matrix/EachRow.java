package matrizes;

import java.util.Scanner;

public class EachRow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, greatest;
		greatest = 0;
		System.out.println("What is the order of the matrix?");
		N = sc.nextInt();
		sc.nextLine();
		
		
		int mat[][] = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("Element ["+ i + "," + j + "] ");
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
			System.out.println("----- next row -----");
		}
		
		System.out.println("Greatest element of each row:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(mat[i][j] > greatest) {
					greatest = mat[i][j];
				}
				}
			System.out.println(greatest);
			greatest = 0;
			}
		
				
		sc.close();
		
		
	}	
}
