package estruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class SquareAndCubeTheRow {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Insert the number of the rows:");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println(i * i * i);
		}
		
		sc.close();
		
	}
	
}
