package estruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class SquareAndCubeTheRow {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Insert the number of the rows:");
		N = sc.nextInt();
		
		N = N + 1;
		for (int i = 1; i < N; i++) {
			
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println(i * i * i);
		}
		
		sc.close();
		
	}	
}
